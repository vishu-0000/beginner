class hash_map
{
	void func(int arr1[],int arr2[],int m ,int n)
	{
HashSet<Integer> hset=new HashSet<>();
for(int i=0;i<m;i++)
	{if(!hset.contains(arr1[i]))
       hset.add(arr1[i]); // created a hash table
	}
	if(!hset.contains(arr2[i]))
       

}
class test
{
	public static void main(String args[])
	{
		int arr1[]={11,1,13,21,3,7};
		int arr2[]={11,3,7,1};
       hash_map obj=new hash_map();
       obj.func(arr1,arr2,6,4);
	}
}