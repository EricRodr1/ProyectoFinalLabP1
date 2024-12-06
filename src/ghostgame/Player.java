/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghostgame;

 
public class Player {
    public String username, password;
    public int puntos;
    public int[][] fantasmas;
    public int cantidad_fantasmas;
    public int numero;
    public String[] logs;
    public static final int partidas = 10;
    
    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        this.puntos = 0;
        this.fantasmas = new int[8][2];
        this.cantidad_fantasmas = 0;
        this.logs = new String[partidas];
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public void agregarFantasma(int fila, int columna) {
        if (cantidad_fantasmas < 8) {
            fantasmas[cantidad_fantasmas][0] = fila;
            fantasmas[cantidad_fantasmas][1] = columna;
            cantidad_fantasmas++;
        }
    }
    
    public void resetFantasmas() {
        cantidad_fantasmas = 0;
    }
    
    public int getNumero() {
        return numero;
    }

    public void añadir_log(String log) {
        for (int i = partidas - 1; i > 0; i--) {
            logs[i] = logs[i - 1];
        }
        logs[0] = log;
    }

    public String[] getLogs() {
        return logs;
    }

    public void setLogs(String[] logs) {
        this.logs = logs;
    }
    
    @Override
    public String toString() {
        return "Jugador: " + username + ", Puntos: " + puntos;
    }
}
