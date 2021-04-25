import java.util.Iterator;

import javax.imageio.stream.ImageInputStream;


public class Main {

	public static void main(String[] args) {
conservative cSape1 = new cSape() ;
cSape1.name = "C#";
cSape1.homework = "Proje 1 ";
cSape1.quiz = true ;
cSape1.evaluation = "Ödevleri nasýl buldunuz?";
cSape1.rollcall = true;


conservative  java1 = new java();
java1.name= "java";
java1.homework = "veri tiplerini araþtirn ";
java1.quiz = false ;
java1.evaluation = "Sorularýnýza cevap alabildiniz mi?";
java1.rollcall = false ;

//conservative conservative1 = new   conservative ();
 
conservative [] conservatives1 = new conservative[] {java1,cSape1};

for (conservative conservative : conservatives1) {
	
	System.out.println(" sistem kuruldu  ");
	
}





MainManager mainManager = new  MainManager();
mainManager.task(cSape1);
mainManager.task2(java1);






	}

}
