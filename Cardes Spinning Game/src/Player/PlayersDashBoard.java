package Player;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;

public class PlayersDashBoard {
	
	Player player;
	List<Player> players;
	public PlayersDashBoard() {
		this.players = new ArrayList<>();
	}
	protected Player getPlayer() {
		return player;
	}
	protected void setPlayer(Player player) {
		this.player = player;
	}
	protected List<Player> getPlayers() {
		return players;
	}
	protected void setPlayers(List<Player> players) {
		this.players = players;
	}
	public void loadRecordInfo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Records.csv"));
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] part = line.split(",");

                String NAME = part[0];
                int SCORE = Integer.parseInt(part[1]);
                players.add(new Player(NAME,SCORE));

            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void readAllList(JTextArea textArea){
      players.forEach(x->x.print(textArea));
    }

    public void writeData(){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("Records.csv"));
                for (Player player : players) {
                    writer
                            .append(player.getName()).append(",")
                            .append(String.valueOf(player.getScore())).append(",");

                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }

    public void newRecords(String name, int score) {
         players.add(new Player(name,score));

    }
	

}
