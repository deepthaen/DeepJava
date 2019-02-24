package interfacePackage;

public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallPark sp = new smallPark();
		bigPark  bp = new bigPark();
		
		sp.ground();
		sp.plants();
		
		bp.ground();
		bp.plants();
		
		
		//   IVechile Interface
		
		vechileOne vo = new vechileOne();
		vo.ChangeGear(6);
		vo.Brake(6);
		vo.Speed(9);
		
		vechicleTwo vt = new vechicleTwo();
		vt.Brake(8);
		vt.ChangeGear(7);
		vt.Speed(9);

		
		//Iplayer Interface
		
		Hockey h = new Hockey();
		h.Move();
		h.play();
		cricket c = new cricket();
		c.Move();
		c.play();

		}

}
