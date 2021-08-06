

object cipher{


	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

        val E=(c:Char,key:Int,a:String)=>
                a((a.indexOf(c.toUpper)+key)%a.size);

        val D=(c:Char,key:Int,a:String)=>
                a((a.indexOf(c.toUpper)-key)%a.size);


        val cipher=(algo:(Char,Int,String)=>
                        Char,s:String,key:Int,a:String)=>
                        s.map(algo(_,key,a));


	
	def main(args:Array[String])
        {
                printf("ENTER THE TEXT : ");
                val s = scala.io.StdIn.readLine();

                
                val ct=cipher(E,s,5,alphabet);

                val pt=cipher(D,ct,5,alphabet);

                printf("\n\nENCRYPTED TEXT IS : ");
                println(ct);
                printf("\n\nDECRYPTED TEXT IS : ");
                println(pt);

                printf("\n\n");
	}
}