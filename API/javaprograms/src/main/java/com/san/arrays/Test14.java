package com.san.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test14 {

	
	public static void main(String[] args) {
		
		List<String> dataList = getDataList();
		Set<String> filteredData = new HashSet<String>();
		
		System.out.println("Total List "+dataList.size());
		
		for(String s : dataList) {
			filteredData.add(s);
		}
		
		
		System.out.println("Filtered List "+filteredData.size());
		
		for(String S : filteredData) {
			System.out.println(S);
		}
	}

	private static List<String> getDataList() {
		
		String[] arr = new String[] {
				"SCL-ICF - MSA-SOW-PO - Commercial EV Catalog.pdf",
				"ConEd-O-R - 2023 Renewal.pdf",
				"KIA - SOW-PO - T 1 6-month extension 2023.pdf",
				"IID - SOW-PO - 2023.pdf",
				"APS - MSA-SOW - EV Shopper and EV Fleets.pdf",
				"Anaheim - MSA-SOW - EV Shopper.pdf",
				"Solectrac EV Fleets - SOW - MSA.pdf",
				"SVCE - MSA-SOW - Phase 1.pdf",
				"SDG-E - MSA - SOW.pdf",
				"Shell - MSA-SOW - Fleet Electrification.pdf",
				"Uber - MSA - SOW.pdf",
				"TrueCar - MSA-SOW - Vehicle",
				"Rhythm Energy - MSA-SOW - EV Shopper.pdf",
				"OfferLogix - MSA - SOW.pdf",
				"KIA - SOW-PO - T 1 6-month extension 2023.pdf",
				"IID - SOW-PO - 2023.pdf",
				"EnergySage - MSA-SOW - EV Shopper.pdf",
				"Ford - MSA-SOW - Consumer incentives API.pdf",
				"Fisker - MSA - SOW.pdf",
				"SCL-ICF - MSA-SOW-PO - Commercial EV Catalog.pdf",
				"Consumer Reports - MSA-SOW - API.pdf",
				"ConEd-O-R - 2023 Renewal.pdf",
				"ConEd-O-R - SOW - Commercial EVs.pdf",
				"ConEd-O-R - SOW - Commercial EVs.pdf",
				"Chargeway - MSA-SOW.pdf",
				"Consumers Energy - MSA-SOW - EV Shopper and Rate Advisor.pdf",
				"Uber - MSA - SOW.pdf",
				"SDG-E - MSA - SOW.pdf",
				"SVCE - MSA-SOW - Phase 1.pdf",
				"Solectrac EV Fleets - SOW - MSA.pdf",
				"TrueCar - MSA-SOW - Vehicle",
				"Rhythm Energy - MSA-SOW - EV Shopper.pdf",
				"SCL-ICF - MSA-SOW-PO - Commercial EV Catalog.pdf",
				"Shell - MSA-SOW - Fleet Electrification.pdf",
				"Ford - MSA-SOW - Consumer incentives API.pdf",
				"Fisker - MSA - SOW.pdf",
				"OfferLogix - MSA - SOW.pdf",
				"EnergySage - MSA-SOW - EV Shopper.pdf",
				"Consumer Reports - MSA-SOW - API.pdf",
				"Consumers Energy - MSA-SOW - EV Shopper and Rate Advisor.pdf",
				"Chargeway - MSA-SOW.pdf",
				"APS - MSA-SOW - EV Shopper and EV Fleets.pdf",
				"Anaheim - MSA-SOW - EV Shopper.pdf",
				"PG-E - CWA - Spanish translation and tool maintenance 2022 - C47042.pdf",
				"PG-E - CWA - Spanish translation and tool maintenance 2022 - C47042.pdf",
				"PG-E - PO - EVSC PSPS scraper and zone display.pdf",
				"PG-E - PO - EVSC PSPS scraper and zone display.pdf",
				"PG-E - PO - EVSC Maintenance continuation through June 30",
				"PG-E - PO - EVSC Maintenance continuation through June 30",
				"ConEd-O-R - PO - Through June '23.pdf",
				"PG-E -  PO - Used EVs maintenance 2700770811.pdf",
				"PG-E Fleets - PO - 2022 - Amend - Extend.pdf",
				"PG-E - PO - 2700369956.pdf",
				"PG-E - PO - 2700504184.pdf",
				"PG-E - PO - Rate advisor - maintenance.pdf",
				"PG-E - PO - Phase 1 Build.pdf",
				"PG-E - PO - Fleets Phase 1.pdf",
				"PG-E - PO - SMD.pdf",
				"PG-E - PO - Phase 6b.pdf",
				"PG-E - CWA - Real time charger availability maintenance - C47017.pdf",
				"Veloz - SOW - L2 Advisor - Incentive Application.pdf",
				"ConEd-O-R - PO - Blanket -master) PO.pdf",
				"PG-E - CWA - SMD.pdf",
				"PG-E - CWA - EVSC Phase 6a.pdf",
				"AE-PO-SOW 8-22 thru 8-23.pdf",
				"Volvo - SOW - API - Amend - Extend 2023.pdf",
				"PG-E - SOW - Marketplace.pdf",
				"PG-E - SOW - Commercial Rate Calculator.pdf",
				"PG-E Fleets - 2022 - Amend - Extend.pdf",
				"PG-E - SOW - Fleets.pdf",
				"PG-E - SOW - Fleets Phase 2.pdf",
				"PG-E - SOW - EVSC - Phase 7.pdf",
				"PG-E - SOW - EVSC - PSPS Enhancements.pdf",
				"PG-E - SOW - SMD.pdf",
				"PG-E - SOW - EVSC - PSPS.pdf",
				"PG-E - SOW - EVSC Phase 6a.pdf",
				"PG-E - CWA - Spanish and Chinese translation maintenance - C47018.pdf",
				"PG-E - SOW - Adding EVSP links to charging station maps.pdf",
				"PG-E - SOW - EVSC - Real time charger availability.pdf",
				"PG-E - SOW - EVSC Phase 3.pdf",
				"PG-E - SOW - EVSC Phase 1.pdf",
				"PG-E - Change Order -no cost) - Phase 6a.pdf",
				"PG-E - SOW - Phase 6b.pdf",
				"PG-E - SOW - EVSC Phase 2.pdf",
				"PG-E - Change Order - EVSC Phase 3 - Maintenance continuation.pdf",
				"Hyundai-IWA-SOW-3-Renewal.pdf",
				"GM - Fit - Finish Change Order June 2022.pdf",
				"PG-E - CWA - Used EV Catalog 2022 - C47016.pdf",
				"ConEd-O-R - Change Order.pdf",
				"Calstart - MSA-SOW - CTW 2023.pdf",
				"Veloz - MSA - HCA IAA.pdf",
				"CALSTART - SOW - Insite -fleets) initial scope - sole-sourced scope.pdf",
				"CALSTART - SOW - INSITE -fleets) initial scope.pdf",
				"PG-E - MSA - Extension to 2024.pdf",
				"Ford T-Cs.pdf",
				"PG-E - MSA - Original MSA.pdf",
				"DTE T-Cs - -MSA-.pdf",
				"DLC - PO - EV Shopper build - maintenance 2019-2020.pdf",
				"PG-E - PO - Translations maintenance 2700770814.pdf",
				"PG-E - PO - Real time charger maintenance 2700770812.pdf",
				"PG-E - PO - Spanish translations - other maintenance fees 2700769890.pdf",
				"PG-E - PO - O-M Base Legacy",
		};
		
		List<String> asList = Arrays.asList(arr);
		 return asList;
	}
	
	
	//public 
}
