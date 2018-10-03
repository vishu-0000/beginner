import java.util.*;
class hash1
{
	void use_hash()
	{
        HashMap<String,String> hey=new HashMap<String , String>();
        // HashMap<String, String> Geeks = new HashMap <> (); 
        System.out.println(hey.isEmpty());
        if(hey.isEmpty())
        {
        	hey.put("lang1","python");
        	hey.put("lang2","java");
        	hey.put("lang3","c++");
        }
        System.out.println(hey.size());

        System.out.println(hey.get("lang1"));
        System.out.println(hey.get("lang2"));
        System.out.println(hey.get("lang4"));

        System.out.println(hey);
	}
	public static void main(String args[])
	{
           hash1 obj=new hash1();
           obj.use_hash();
	}
}
