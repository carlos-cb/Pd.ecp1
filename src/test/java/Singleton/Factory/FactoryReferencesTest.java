package Singleton.Factory;

import static org.junit.Assert.*;

import org.junit.Test;

import Singleton.Factory.FactoryReferences;

public class FactoryReferencesTest { 
 
 
     @Test 
     public void testFactoryReferencesIsSingleton() { 
         assertSame(FactoryReferences.getFactory(), FactoryReferences.getFactory()); 
     } 
 
     @Test 
     public void testFactoryReferencesSingletonNotNull() { 
         assertNotNull(FactoryReferences.getFactory()); 
     } 
 
 
     @Test 
     public void testFactoryReferences() { 
         assertEquals(0, FactoryReferences.getFactory().getReference("cero")); 
         assertEquals(1, FactoryReferences.getFactory().getReference("uno")); 
         FactoryReferences.getFactory().removeReference("cero"); 
         assertEquals(2, FactoryReferences.getFactory().getReference("cero")); 
     } 
} 
