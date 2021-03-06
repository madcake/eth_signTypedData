package net.consensys.tools.ethereum.TypedDataSignature;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import javax.xml.bind.DatatypeConverter;

import org.junit.Test;
import org.web3j.abi.datatypes.Utf8String;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TypedDataSignatureTest {

    @Test
    public void generateSignatureHash2stringsTest() {

	log.info("###########################################################");
	log.info("[START] generateSignatureHash2stringsTest");
	
	TypedData t1 = new TypedData("field1", "string", "val1");
	TypedData t2 = new TypedData("field2", "string", "val2");
	
	byte[] result = TypedDataSignature.generateSignatureHash(Arrays.asList(t1, t2));

	log.info(DatatypeConverter.printHexBinary(result));
	
	//assertEquals(DatatypeConverter.printHexBinary(new byte[] {(byte)1}), DatatypeConverter.printHexBinary(result));
	
	log.info("[END] generateSignatureHash2stringsTest");
    }

    @Test
    public void generateSignatureHash1string1bool1uintTest() {

	log.info("###########################################################");
	log.info("[START] generateSignatureHash1string1bool1uintTest");
	
	TypedData t1 = new TypedData("field1", "string", "val1");
	TypedData t2 = new TypedData("field2", "uint", 5);
	TypedData t3 = new TypedData("field3", "bool", true);
	
	byte[] result = TypedDataSignature.generateSignatureHash(Arrays.asList(t1, t2, t3));

	log.info(DatatypeConverter.printHexBinary(result));
	
	//assertEquals(DatatypeConverter.printHexBinary(new byte[] {(byte)1}), DatatypeConverter.printHexBinary(result));
	
	log.info("[END] generateSignatureHash1string1bool1uintTest");
    }
}
