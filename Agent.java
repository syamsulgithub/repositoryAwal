/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package DataAgent;

import DataPeserta.Peserta;

/**
 test perubahan kedua* 
 * @author Ari Sudrajat
 */
public class Agent {
    private String NamaAgent;
    private String Username;
    private String Password;
    //private String ListPeserta;
    private Peserta[] ListPeserta;

    public Agent(String NamaAgent, String ListPeserta, String Username, String Password) {
        this.NamaAgent = NamaAgent;
        //this.ListPeserta = ListPeserta;
        this.Username = Username;
        this.Password = Password;
        this.ListPeserta = new Peserta[10];
    }

    public void setNamaAgent(String NamaAgent) {
        this.NamaAgent = NamaAgent;
    }

    //public void setListPeserta(String ListPeserta) {
    public void setListPeserta(Peserta[] ListPeserta) {
        this.ListPeserta = ListPeserta;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNamaAgent() {
        return NamaAgent;
    }

    //public String getListPeserta() {
    public Peserta[] getListPeserta() {
        return ListPeserta;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
    
public String lihatProfile(){
    return "Nama Agent: " + NamaAgent +
            "\n List Peserta: " + ListPeserta;
}

    public void getStatusDatulPeserta(Peserta[] listPeserta){
        for (int i = 0; i<listPeserta.length;i++){
            System.out.println("["+i+"] "+listPeserta[i].getNama()+" : "+listPeserta[i].getStatusDatul()
            +" + "+listPeserta[i].getCabang());
        }
        
    }
}
