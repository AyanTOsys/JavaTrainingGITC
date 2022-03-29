
public class ChemicalElement {
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	public int getAtomicNumber() {
		return atomicNumber;
	}
	public void setAtomicNumber(int atomicNumber) {
		this.atomicNumber = atomicNumber;
	}
	public String getAtomicName() {
		return atomicName;
	}
	public void setAtomicName(String atomicName) {
		this.atomicName = atomicName;
	}
	public String getAtomicFormula() {
		return atomicFormula;
	}
	public void setAtomicFormula(String atomicFormula) {
		this.atomicFormula = atomicFormula;
	}
	public float getAtomicWeight() {
		return atomicWeight;
	}
	public void setAtomicWeight(float atomicWeight) {
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}	
}
