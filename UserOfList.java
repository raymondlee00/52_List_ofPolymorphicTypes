/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inArraySlots list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
        list.add( 2, -1, -2.0,  "important", true);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added string: " + list);

        list.add( 0, 17, -2.0,  "junk", false);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added int: " + list);

        list.add( 1, -1, 1.618, "junk", true);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added double: " + list);

	int elemIndex = 0;
        // Add enough elements that expansion is expected
        for( ; elemIndex < 15; elemIndex++ ) {

            if( elemIndex == 10) System.out.println( "expansion expected");

            list.add( 0, -elemIndex, -2.0,  "junk", false);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of expanded list: "
             + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

	// tests get
	System.out.println( "tests get\n" + list.get(3).getString());
	System.out.println( list.get(3).getInt());
	System.out.println( list.get(3).getDouble());
    for (int i = list.getFilledElements(); i > 0; i--){
      System.out.println( list.get(i));
    }
}
}
