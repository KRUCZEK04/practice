import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    @Test
    public void shouldContainElement(){
        //given
        MyArrayList arrayContains = new MyArrayList();
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        arrayContains.add("Kruk");
        //when
        boolean contains = arrayContains.contains("Kruk");
        //then
        assertTrue(contains);
    }

    @Test
    public void shouldRemoveAndMoveElements() {
        //given
        MyArrayList arrayRemove = new MyArrayList();
        arrayRemove.add("Kruk");
        arrayRemove.add("2");
        arrayRemove.add("3");
        arrayRemove.add("4");
        arrayRemove.add("5");
        //when
        boolean remove = arrayRemove.remove("3");

        //then
        assertEquals(4, arrayRemove.size());
        assertEquals(arrayRemove.get(2), "4");
    }




        @Test
        public void shouldFindObjectByIndex(){
        //given
        MyArrayList arrayIndexOf = new MyArrayList();
        arrayIndexOf.add("Kruk");
        arrayIndexOf.add("2");
        arrayIndexOf.add("3");
        arrayIndexOf.add("3");
        arrayIndexOf.add("4");
        arrayIndexOf.add("5");
        //when
            int result = arrayIndexOf.indexOf("3");


            //then
        assertEquals(2,result);}
//        assertEquals(arrayRemove.get(2),"4");

        @Test
        public void shouldCheckIfMethodReplacesObject() {
            //given
            MyArrayList arraySet = new MyArrayList();
            arraySet.add("0");
            arraySet.add("1");
            arraySet.add("2");
            arraySet.add("3");
            arraySet.add("4");
            //when
            Object zmiana = arraySet.set(2,"Dawid");
            //then
            assertEquals("2",zmiana);}

            @Test
            public void shouldRemoveAndMoveTheArray() {

                //given
                MyArrayList arrayRemove = new MyArrayList();
                arrayRemove.add("0");
                arrayRemove.add("1");
                arrayRemove.add("2");
                arrayRemove.add("3");
                arrayRemove.add("4");
                arrayRemove.add("5");
                arrayRemove.add("6");
                arrayRemove.add("7");
                //when
                Object remove = arrayRemove.remove(3);
                //then
                assertEquals("3", remove);
                assertEquals("4", arrayRemove.get(3));
                assertEquals("5", arrayRemove.get(4));
                assertEquals("6", arrayRemove.get(5));
                assertEquals("7", arrayRemove.get(6));
                assertEquals(null, arrayRemove.get(7));
            }
            @Test
            public void shouldAddAndMoveElementsToTheRight() {
                //given
                MyArrayList arrayAdd = new MyArrayList();
                arrayAdd.add("0");
                arrayAdd.add("1");
                arrayAdd.add("2");
                arrayAdd.add("3");
                arrayAdd.add("4");
                arrayAdd.add("5");
                arrayAdd.add("6");
                arrayAdd.add("7");
                arrayAdd.add("8");
                //when
                arrayAdd.add(3,"Dawid");
                //then
                assertEquals("Dawid",arrayAdd.get(3));
                assertEquals("3",arrayAdd.get(4));
            }

}