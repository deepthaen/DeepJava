

package inhertiance;

public class MutliLevelInhertinace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLassE MLI = new CLassE();
		MLI.log();
		MLI.LogHistory();
		MLI.Truecall();
            
	}

}
class ClassC {
	void log() {
		System.out.println("Class C is implemented");
			}
}
class ClassD extends ClassC{
	void LogHistory() {
		System.out.println("Class D Implemented");
	}
}

class CLassE extends ClassD{
	void Truecall() {
		System.out.println("Class E Is implemented");
	}
}