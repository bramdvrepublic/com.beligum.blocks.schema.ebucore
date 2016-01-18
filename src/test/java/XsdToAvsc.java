import com.beligum.blocks.schema.ebucore.jaxb.CoreMetadataType;
import com.beligum.blocks.schema.ebucore.jaxb.DescriptionType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroFactory;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;
import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;

import java.io.File;
import java.io.FileWriter;

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
    public static void testJacksonAvro() throws Exception
    {
        ObjectMapper mapper = new ObjectMapper(new AvroFactory());
        AvroSchemaGenerator gen = new AvroSchemaGenerator();
        mapper.acceptJsonFormatVisitor(CoreMetadataType.class, gen);
        AvroSchema schemaWrapper = gen.getGeneratedSchema();

        org.apache.avro.Schema avroSchema = schemaWrapper.getAvroSchema();
        //String asJson = avroSchema.toString(true);

        FileWriter schemaWriter = new FileWriter(new File("/home/bram/Projects/Workspace/idea/com.beligum.blocks.schema.ebucore/src/main/avro/ebucore.avsc"));
        schemaWriter.write(avroSchema.toString(true));
        schemaWriter.flush();
        schemaWriter.close();
    }
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

    //-----PROTECTED METHODS-----

    //-----PRIVATE METHODS-----

}
