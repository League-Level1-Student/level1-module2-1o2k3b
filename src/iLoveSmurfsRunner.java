import _02_smurf.Smurf;

public class iLoveSmurfsRunner {
public static void main(String[] args) {
	Smurf handySmurf = new Smurf("handy smurf");
	Smurf papaSmurf = new Smurf("papa smurf");
	Smurf smurfette = new Smurf("smurfette");
	System.out.println(handySmurf.getName());
	System.out.println(papaSmurf.getName());
	System.out.println(smurfette.getName());
	handySmurf.eat();
	System.out.println(papaSmurf.getHatColor());
	System.out.println(papaSmurf.isGirlOrBoy());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}
