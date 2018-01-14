package net.radu.Backend.daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.radu.Backend2.dao.EvenimentDAO;
import net.radu.Backend2.dto.Eveniment;

@Repository("evenimentDAO")
public class EvenimentDAOImpl implements EvenimentDAO {

	private static List<Eveniment> evenimente = new ArrayList<Eveniment>();

	static {
		Eveniment eveniment = new Eveniment();
		eveniment.setEventId(1);
		eveniment.setuId(1);
		eveniment.setDescription("eveniment 1");
		eveniment.setName("test1");
		eveniment.setTag("Natural_Disaster");
		eveniment.setDate(new Date(2017, 12, 12, 13, 01));
		evenimente.add(eveniment);

		eveniment = new Eveniment();
		eveniment.setEventId(2);
		eveniment.setuId(2);
		eveniment.setDescription("eveniment 2");
		eveniment.setName("test2");
		eveniment.setTag("Natural_Disaster");
		eveniment.setDate(new Date(2017, 12, 12, 13, 02));
		evenimente.add(eveniment);

		eveniment = new Eveniment();
		eveniment.setEventId(3);
		eveniment.setuId(3);
		eveniment.setDescription("eveniment 3");
		eveniment.setName("test3");
		eveniment.setTag("Terrorist_Act");
		eveniment.setDate(new Date(2017, 12, 12, 13, 03));
		evenimente.add(eveniment);

		eveniment = new Eveniment();
		eveniment.setEventId(4);
		eveniment.setuId(4);
		eveniment.setDescription("eveniment4 ");
		eveniment.setName("test4");
		eveniment.setTag("Accident");
		eveniment.setDate(new Date(2017, 12, 12, 13, 04));
		evenimente.add(eveniment);
	}

	public List<Eveniment> list() {
		// TODO Auto-generated method stub
		return evenimente;
	}

}
