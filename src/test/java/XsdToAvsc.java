import com.beligum.blocks.schema.ebucore.v1_6.jaxb.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.report.ConsoleProcessingReport;
import com.github.fge.jsonschema.core.report.LogLevel;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.core.tree.CanonicalSchemaTree;
import com.github.fge.jsonschema.core.tree.SchemaTree;
import com.github.fge.jsonschema.core.util.ValueHolder;
import com.github.fge.jsonschema2avro.AvroWriterProcessor;
import com.sun.codemodel.JCodeModel;
import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.File;
import java.io.FileWriter;
import java.lang.String;
import java.net.URL;

/**
 * Created by bram on 1/17/16.
 * See http://www.programcreek.com/java-api-examples/index.php?source_dir=xml-to-avro-master/avro-to-xml/src/main/java/mpigott/avro/xml/Main.java#
 * and https://github.com/mikepigott/xml-to-avro/tree/master/avro-to-xml/src/main/java/mpigott
 */
public class XsdToAvsc
{
    //-----CONSTANTS-----

    //-----VARIABLES-----

    //-----CONSTRUCTORS-----

    //-----PUBLIC METHODS-----
    public static void main(String[] args) throws Exception
    {
        //        xsdToAvsc(new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.dublincore/src/main/resources/simpledc20021212.xsd"),
        //                  new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.dublincore/src/main/avro/simpledc20021212.avsc"),
        //                  new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.dublincore/src/main/resources/"),
        //                  new QName("http://purl.org/dc/elements/1.1/", "elementContainer"));

        //                xsdToAvsc(new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/resources/ebucore_adjusted.xsd"),
        //                          new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/avro/ebucore.avsc"),
        //                          new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/resources/"),
        //                          new QName("urn:ebu:metadata-schema:ebuCore_2015", "ebuCoreMain"));

        //        testEbuCore();

        //testAvroReflection();

        //        testXml();

        //        testJacksonAvro();

        //        mpigottMain(args);

        //generateJsonSchema();

        jsonSchemaToAvro();

        //testBuildPojoFromJsonSchema();
    }
    private static void testEbuCore()
    {
        //        ebu.metadata_schema.ebucore_2015.coreMetadata coreMetadata = new ebu.metadata_schema.ebucore_2015.coreMetadata();
        //coreMetadata.
    }

    public static void testAvroReflection() throws Exception
    {
        Schema avroSchema = ReflectData.get().getSchema(DescriptionType.class);

        FileWriter schemaWriter = new FileWriter(new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/avro/ebucore.avsc"));
        schemaWriter.write(avroSchema.toString(true));
        schemaWriter.flush();
        schemaWriter.close();
    }
    //    public static void testJacksonAvro() throws Exception
    //    {
    //        ObjectMapper mapper = new ObjectMapper(new AvroFactory());
    //        AvroSchemaGenerator gen = new AvroSchemaGenerator();
    //        mapper.acceptJsonFormatVisitor(CoreMetadataType.class, gen);
    //        AvroSchema schemaWrapper = gen.getGeneratedSchema();
    //
    //        org.apache.avro.Schema avroSchema = schemaWrapper.getAvroSchema();
    //        //String asJson = avroSchema.toString(true);
    //
    //        FileWriter schemaWriter = new FileWriter(new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/avro/ebucore.avsc"));
    //        schemaWriter.write(avroSchema.toString(true));
    //        schemaWriter.flush();
    //        schemaWriter.close();
    //    }
    //    public static void xsdToAvsc(File xmlSchema, File avscSchema, File contextDir, QName rootElement) throws Exception
    //    {
    //        //        Enable avro-to-xml maven plugin of you want to test this
    //        XmlDatumConfig config = new XmlDatumConfig(xmlSchema, contextDir.getAbsolutePath(), rootElement);
    //
    //        XmlDatumWriter writer = new XmlDatumWriter(config);
    //        Schema avroSchema = writer.getSchema();
    //
    //        avscSchema.getParentFile().mkdirs();
    //
    //        FileWriter schemaWriter = new FileWriter(avscSchema);
    //        schemaWriter.write(avroSchema.toString(true));
    //        schemaWriter.flush();
    //        schemaWriter.close();
    //    }
    //    public static void mpigottMain(String[] args) throws Exception
    //    {
    //        File xmlSchema = new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/3rdparty/xml-to-avro/avro-to-xml/src/test/resources/complex_schema.xsd");
    //
    //        XmlDatumConfig config = new XmlDatumConfig(xmlSchema, "http://www.test.com/AvroTest", new QName("urn:avro:complex_schema", "root"));
    //
    //        XmlDatumWriter writer = new XmlDatumWriter(config);
    //
    //        Schema avroSchema = writer.getSchema();
    //
    //        FileWriter schemaWriter = new FileWriter("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/resources/ebucore.avsc");
    //        schemaWriter.write(avroSchema.toString(true));
    //        schemaWriter.flush();
    //        schemaWriter.close();
    //    }
    //    public static void testXml()
    //    {
    //        final ObjectFactory ebuCoreFactory = new ObjectFactory();
    //        final EbuCoreMainType ebuCore = ebuCoreFactory.createEbuCoreMainType();
    //        final CoreMetadataType ebuCoreMetaData = ebuCoreFactory.createCoreMetadataType();
    //        ebuCore.setCoreMetadata(ebuCoreMetaData);
    //
    //        final PartType editorialMetadataPart = ebuCoreFactory.createPartType();
    //        editorialMetadataPart.setPartName("EditorialMetadata");
    //        final TitleType titleType = ebuCoreFactory.createTitleType();
    //        titleType.setTypeLabel("ProgramTitle");
    //        final ElementType titleElementType = ebuCoreFactory.createElementType();
    //        titleElementType.setLang("fr");
    //        titleElementType.setValue("Titre du pogramme");
    //        titleType.getTitle().add(titleElementType);
    //        editorialMetadataPart.getTitle().add(titleType);
    //        ebuCoreMetaData.getPart().add(editorialMetadataPart);
    //
    //        StringWriter sw = new StringWriter();
    //        JAXB.marshal(ebuCore, sw);
    //        System.out.println(sw.getBuffer().toString());
    //    }
    public static void generateJsonSchema() throws Exception
    {
        final File jsonSchemaFile = new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/resources/ebucore.json");

        //see http://stackoverflow.com/questions/15915971/how-to-generate-json-schema-from-a-jaxb-annotated-class
        AnnotationIntrospectorPair introspector = new AnnotationIntrospectorPair(
                        new JaxbAnnotationIntrospector(TypeFactory.defaultInstance()),
                        new JacksonAnnotationIntrospector());

        //http://stackoverflow.com/questions/17783909/create-json-schema-from-java-class
        ObjectMapper objectMapper2 = new ObjectMapper();
        objectMapper2.setAnnotationIntrospector(introspector);

        //HyperSchemaFactoryWrapper visitor = new HyperSchemaFactoryWrapper();
        SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
        objectMapper2.acceptJsonFormatVisitor(objectMapper2.constructType(EbuCoreMainType.class), visitor);
        JsonSchema jsonSchema2 = visitor.finalSchema();
        if (jsonSchemaFile.exists()) {
            jsonSchemaFile.delete();
        }
        //String schema = objectMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema2);
        ObjectWriter fileSchemaWriter = objectMapper2.writerWithDefaultPrettyPrinter();
        fileSchemaWriter.writeValue(jsonSchemaFile, jsonSchema2);
    }
    public static void jsonSchemaToAvro() throws Exception
    {
        final File jsonSchemaFile = new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/resources/ebucore.json");

        //see https://github.com/fge/json-schema-avro/blob/master/src/test/java/com/github/fge/jsonschema2avro/AvroWriterProcessorTest.java
        JsonNode jsonSchema = JsonLoader.fromFile(jsonSchemaFile);
        //jsonSchema = JsonLoader.fromString("{\"type\":\"object\",\"additionalProperties\":{\"type\":\"string\"}}");

        final SchemaTree tree = new CanonicalSchemaTree(jsonSchema);
        //final SchemaTree tree = new CanonicalSchemaTree(SchemaKey.forJsonRef(JsonRef.emptyRef()), jsonSchema);
        final ValueHolder<SchemaTree> input = ValueHolder.hold("schema", tree);
        AvroWriterProcessor processor = new AvroWriterProcessor();

        ProcessingReport report = new ConsoleProcessingReport(LogLevel.DEBUG);
        Schema jsonSchemaToAvro = processor.process(report, input).getValue();

        FileWriter schemaWriter = new FileWriter("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/resources/ebucore.avsc");
        schemaWriter.write(jsonSchemaToAvro.toString(true));
    }
    public static void testBuildPojoFromJsonSchema() throws Exception
    {
        JCodeModel codeModel = new JCodeModel();

        URL source = new URL("file:///home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/resources/ebucore.json");

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() { // set config option by overriding method
                return true;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(), new SchemaStore()), new SchemaGenerator());
        mapper.generate(codeModel, "ClassName", "com.example", source);

        codeModel.build(new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/resources/json-pojo"));
    }
    public static void testJsonSerialization() throws Exception
    {
        // see https://github.com/mikrosimage/jebu-core
        final ObjectFactory ebuCoreFactory = new ObjectFactory();
        final EbuCoreMainType ebuCore = ebuCoreFactory.createEbuCoreMainType();
        final CoreMetadataType ebuCoreMetaData = ebuCoreFactory.createCoreMetadataType();
        ebuCore.setCoreMetadata(ebuCoreMetaData);

        final PartType editorialMetadataPart = ebuCoreFactory.createPartType();
        editorialMetadataPart.setPartName("EditorialMetadata");
        final TitleType titleType = ebuCoreFactory.createTitleType();
        titleType.setTypeLabel("ProgramTitle");
        final ElementType titleElementType = ebuCoreFactory.createElementType();
        titleElementType.setLang("fr");
        titleElementType.setValue("Titre du pogramme");
        titleType.getTitle().add(titleElementType);
        editorialMetadataPart.getTitle().add(titleType);
        ebuCoreMetaData.getPart().add(editorialMetadataPart);

        ObjectMapper mapper = new ObjectMapper();
        //ObjectMapper mapper = new DefaultObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
        mapper.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.ANY);

        mapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
        String json = mapper.writerWithType(ebuCore.getClass()).writeValueAsString(ebuCore);
        System.out.println(json);

        EbuCoreMainType in = mapper.reader(EbuCoreMainType.class).readValue(json);
        System.out.println(mapper.writerWithType(in.getClass()).writeValueAsString(in));
    }

    //-----PROTECTED METHODS-----

    //-----PRIVATE METHODS-----
}
