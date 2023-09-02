import java.util.ArrayList;
public class Array {
public static  void main(String[] args) {
	ArrayList<Integer> arrl=new ArrayList<>(20);
	ArrayList<Integer> arr2=new ArrayList<>(10);
	arrl.add(10, null);
	arr2.add(30);
	arr2.add(40);
	arrl.addAll(0,arr2);
	for(int i=0;i<arrl.size();i++)
	{
		System.out.println(arrl.get(i));
	}

//	System.out.println(arrl);
//
for(Integer i:All)
{
	System.out.println(i);
}
}
}





