public class WRM {
    Patient dh;

    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient n0 = dh.prev;
        Patient n2 = dh;
        Patient n1 = new Patient(id, name, age, bloodgroup, n2, n0);
        
        n0.next = n1;
        n2.prev = n1;
    }

    public void servePatient() {
        dh.next = dh.next.next;         // wow
    }

    public void showAllPatient() {
        Patient n0 = dh.next;
        while (n0 != dh) {
            System.out.print(n0.name + " --> ");
            n0 = n0.next;
        }
        System.out.print("NULL");
        System.out.println("");
    }

    public Boolean canDoctorGoHome() {
        return dh.next == dh ? true : false;
    }

    public void cancelAll() {
        dh.next = dh;
        dh.prev = dh;
    }


    public void reverseTheLine() {
        Patient n0 = dh;
        Patient n1 = dh.next;

        dh.prev = n1;

        while(n1 != dh) {
            Patient n2 = n1.next;
            n1.next = n0;
            n1.prev = n2;

            n0 = n1;
            n1 = n2;
        }

        dh.next = n0;
    }
}