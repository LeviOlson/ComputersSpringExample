/**  
* @author Levi Olson - lolson17  
* CIS175 - Spring 2021  
* Mar 17, 2021  
*/

package dmacc.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int GBsOfRAM;
	private double processingGhz;
	private int CPUCoreCount;
	private int GBsOfStorage;
	
	public Computer() {
		super();
	}
	
	public Computer(int GBsOfRAM, double processingGhz, int CPUCoreCount, int GBsOfStorage) {
		super();
		this.GBsOfRAM = GBsOfRAM;
		this.processingGhz = processingGhz;
		this.CPUCoreCount = CPUCoreCount;
		this.GBsOfStorage = GBsOfStorage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGBsOfRAM() {
		return GBsOfRAM;
	}

	public void setGBsOfRAM(int gBsOfRAM) {
		GBsOfRAM = gBsOfRAM;
	}

	public double getProcessingGhz() {
		return processingGhz;
	}

	public void setProcessingGhz(double processingGhz) {
		this.processingGhz = processingGhz;
	}

	public int getCPUCoreCount() {
		return CPUCoreCount;
	}

	public void setCPUCoreCount(int cPUCoreCount) {
		CPUCoreCount = cPUCoreCount;
	}

	public int getGBsOfStorage() {
		return GBsOfStorage;
	}

	public void setGBsOfStorage(int gBsOfStorage) {
		GBsOfStorage = gBsOfStorage;
	}
	
	public String toString() {
		return "ID = " + id + " RAM = " + GBsOfRAM + " Ghz = " + processingGhz + " core count = " + CPUCoreCount + "  storage = " + GBsOfStorage;
	}

}
