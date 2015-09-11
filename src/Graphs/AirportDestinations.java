package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AirportDestinations {

	interface Airport {
		String getCode();
		List<Airport> getDirectConnections();
	}

	//print all destinations from a airport given a departure destination with the number of stops it takes to get there 

	public void printDestinations(Airport source)
	{
		if(source == null)
			return;

		int stops = 0;

		Queue<Airport> queue = new LinkedList<Airport>();	
		queue.add(source);

		while(!queue.isEmpty())
		{
			int size = queue.size();
			while(size != 0)
			{
				Airport destination = queue.remove();
				System.out.printf("The number of stops to reach %s is %s", 
					destination.getCode(), stops);

				for(Airport a : destination.getDirectConnections())
				{
					queue.add(a);
				}
				
				size--;
			}

			stops++;
		}
	}

}
