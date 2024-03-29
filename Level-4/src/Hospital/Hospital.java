package Hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	ArrayList<Zombie> zombies = new ArrayList<Zombie>();

	public ArrayList<Zombie> getZombies(){
		return zombies;
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public void add(Patient p) {
		patients.add(p);
	}

	public void add(Doctor d) {
		doctors.add(d);
	}

	public void makeDoctorsWork() {
		for(Doctor d: doctors){
			d.doMedicine();
		}
		for(Patient p: patients){
			if(!p.isAlive){
				patients.remove(p);
				zombies.add(new Zombie(""));
			}
		}
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int i = 0;
		for(Doctor d: doctors){
			for(int j = 0; j < 3; j++){
				try{
					d.assignPatient(patients.get(i));
					i++;
				}catch(Exception e){
					
				}
			}
		}
	}
}