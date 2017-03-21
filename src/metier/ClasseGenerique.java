package metier;

/**
 * Classe generique ayant trois attributs de types differents
 * @author Stagiaire
 *
 * @param <T1> premier type d'objet
 * @param <T2> deuxieme type d'objet
 * @param <T3> troiseme type d'objet
 */
public class ClasseGenerique<T1,T2, T3> {
	private T1 x;
	private T2 y;
	private T3 z;
	
	/**
	 * Constructeur
	 * @param x objet de type T1
	 * @param y objet de type T2
	 * @param z objet de type T3
	 */
	public ClasseGenerique(T1 x, T2 y, T3 z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T1 getX() {
		return x;
	}

	public void setX(T1 x) {
		this.x = x;
	}

	public T2 getY() {
		return y;
	}

	public void setY(T2 y) {
		this.y = y;
	}

	public T3 getZ() {
		return z;
	}

	public void setZ(T3 z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "ClasseGenerique [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	

}
