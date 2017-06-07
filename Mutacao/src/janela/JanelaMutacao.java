package janela;

//This is valid MIJava
public miclass JanelaMutacao extends Super1, Super2 {
// This Sub miclass autmatically inherits both 
	Super1.printName() and Super2.getName()
}
miclass Super1 {
public void printName() {
 System.out.println("Super1");
}
}
miclass Super2 {
public String getName() {
 return "Super2";
}
}