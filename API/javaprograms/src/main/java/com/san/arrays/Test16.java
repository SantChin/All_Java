package com.san.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test16 {

	public static void main(String[] args) {
		
		List<String> list1 =getSubList();
        List<String> list2 =  getMainList();
        

        Map<String, String> matches = compareLastThreeWords(list1, list2);

        // Print the matching strings
        for (Map.Entry<String, String> match : matches.entrySet()) {
            System.out.println("List 1: " + match.getKey());
            System.out.println("List 2: " + match.getValue());
            System.out.println();
        }
        
        
	}
	
	
	
	 public static Map<String, String> compareLastThreeWords(List<String> list1, List<String> list2) {
	        Map<String, String> matches = new HashMap<>();

	        for (String str1 : list1) {
	            String[] words1 = str1.split(" ");
	            String lastThreeWords1 = getLastThreeWords(words1);

	            for (String str2 : list2) {
	                String[] words2 = str2.split(" ");
	                String lastThreeWords2 = getLastThreeWords(words2);

	                if (lastThreeWords1.equals(lastThreeWords2)) {
	                    matches.put(str1, str2);
	                    break;
	                }
	            }
	        }

	        return matches;
	    }

	    public static String getLastThreeWords(String[] words) {
	        StringBuilder lastThreeWords = new StringBuilder();
	        int length = words.length;

	        if (length >= 3) {
	            lastThreeWords.append(words[length - 3]).append(" ");
	            lastThreeWords.append(words[length - 2]).append(" ");
	            lastThreeWords.append(words[length - 1]);
	        } else {
	            for (String word : words) {
	                lastThreeWords.append(word).append(" ");
	            }
	        }

	        return lastThreeWords.toString().trim();
	    }
	
	
	
	private static List<String> getMainList() {
		String[] arr = new String[] {
				"ADS Tec - SOW.pdf",
				"ADS Tech - MSA.pdf",
				"AE-PO_SOW 8-22 thru 8-23.pdf",
				"Anaheim - MSA+SOW - EV Shopper.pdf",
				"Anaheim - SOW - Consulting Agreement.pdf",
				"APS - MSA+SOW - EV Shopper and EV Fleets.pdf",
				"APS - PO - EV Shopper and EV Fleets.pdf",
				"Austin Energy - Change Order - Spanish Add On.pdf",
				"Austin Energy - SOW - Dealer Expansion.pdf",
				"Austin Energy - SOW - EV Shopper.pdf",
				"Austin Energy - SOW - Spanish Translations.pdf",
				"BC Hydro - MSA.pdf",
				"BC Hydro - SOW - API activation.pdf",
				"BC Hydro ZR Change Order June 2022.pdf",
				"BMW - SOW - T3 Dealers Route Mapping API.pdf",
				"BMW CM Change Order 2022_06_14_v1.pdf",
				"BMW Critical Mass - SOW - TCO API 2022.pdf",
				"BMW-Critical Mass - Change Order - Adding TCO.pdf",
				"BMW-Critical Mass - MSA.pdf",
				"BMW-Critical Mass - SOW - Change Order - Add EA chargers to routing service.pdf",
				"BMW-Critical Mass - SOW - Public Charger API.pdf",
				"BrightDrop - PO 4500000311.pdf",
				"BrightDrop - SOW - PID and PTCO.pdf",
				"Burbank - SOW - 2022 Renewal.pdf",
				"Burbank - SOW - SCPPA EV Shopper.pdf",
				"Calstart - MSA_SOW - CTW 2023.pdf",
				"CALSTART - SOW - EnergIIZE Fleet.pdf",
				"CALSTART - SOW - Insite -- No-cost amendment 1-26-2022 - 1 of 2.pdf",
				"CALSTART - SOW - Insite -- No-cost amendment 1-26-2022 - 2 of 2.pdf",
				"CALSTART - SOW - Insite (fleets) initial scope - sole-sourced scope.pdf",
				"CALSTART - SOW - INSITE (fleets) initial scope.pdf",
				"CALSTART - SOW - Insite 2023 Renewal.pdf",
				"Chargeway - MSA+SOW.pdf",
				"Client Contracts & POs - Notes.docx",
				"Colton - SOW - Renewal through 2024.pdf",
				"Colton - SOW - SCPPA EV Shopper.pdf",
				"Colton - SOW - Year 2 - SCPPA Task Order.pdf",
				"ConEd - PO - Enhancements.pdf",
				"ConEd - PO - Launch and maintenance - ConEd portion - PO5729770.pdf",
				"ConEd - PO - Launch and maintenance - ORU portion - PO2155127.pdf",
				"ConEd - PO - Setup Fee - ConEd portion - PO5638748.pdf",
				"ConEd - PO - Setup Fee - ORU portion - PO2141591.pdf",
				"ConEd - PO -April 2023.pdf",
				"ConEd MSA.pdf",
				"ConEd-O&R - 2023 Renewal.pdf",
				"ConEd-O&R - Change Order.pdf",
				"ConEd-O&R - PO - Blanket (master) PO.pdf",
				"ConEd-O&R - PO - Through June '23.pdf",
				"ConEd-O&R - SOW - Commercial EVs.docx",
				"ConEd-O&R - SOW - Commercial EVs.pdf",
				"Consumer Reports - MSA+SOW - API.pdf",
				"Consumer Reports - SOW - 2023 extension.pdf",
				"Consumers Energy - Change Order.pdf",
				"Consumers Energy - MSA+SOW - EV Shopper and Rate Advisor.pdf",
				"Consumers Energy - PO - EV Shopper.pdf",
				"DLC - MSA.pdf",
				"DLC - PO - EV Shopper build + maintenance 2019-2020.pdf",
				"DLC - PO - EV Shopper Continuation PO.pdf",
				"DLC - SOW - EV Shopper Continuation 2021-2023.pdf",
				"DLC - SOW - EV Shopper Continuation.pdf",
				"DLC - SOW - EV Shopper.pdf",
				"DLC - SOW - Rate Advisor.pdf",
				"DoorDash - Change Order - Compare Used EVs.pdf",
				"DoorDash EV Shopper SOW.pdf",
				"DoorDash MSA.pdf",
				"DTE - Amend and Extend 2022.pdf",
				"DTE - PO - EV Shopper.pdf",
				"DTE - PO - Fleets.pdf",
				"DTE - SOW - EV Shopper.pdf",
				"DTE T&Cs - _MSA_.pdf",
				"EA - PO - Incentive database.pdf",
				"EA - SOW - Incentive Data Tracking.pdf",
				"Edelman - Consumer API SOW.pdf",
				"Edelman - MSA.pdf",
				"El Paso Electric - MSA.pdf",
				"El Paso Electric - SOW - EV Shopper.pdf",
				"EnergySage - MSA+SOW - EV Shopper.pdf",
				"Evergy - MSA.pdf",
				"Evergy - SOW.pdf",
				"Fisker - MSA & SOW.pdf",
				"Ford - MSA+SOW - Consumer incentives API.pdf",
				"Ford - PO - 2021 Consumer Incentives - PO2053463.pdf",
				"Ford - PO - 2022 Consumer Incentives - PO2169565.pdf",
				"Ford - PO - 2023 Consumer Incentives.pdf",
				"Ford - SOW - 2023 Consumer Incentives.pdf",
				"Ford - SOW - Canada API.pdf",
				"Ford - SOW- 2022 Consumer Incentives.pdf",
				"Ford T&Cs.pdf",
				"Glendale - SOW - SCPPA EV Shopper.pdf",
				"GM - Fit & Finish Change Order June 2022.pdf",
				"GM - MSA.pdf",
				"GM - PO - 2021 PO 4301242402.pdf",
				"GM - PO - 2022 PO 4301396300.pdf",
				"GM - Quote - Renewal RFQ 2022 2023.pdf",
				"GM - SOW - Consumer Incentives, Fleet Shopper, Incentive Dashboard.pdf",
				"GM - SOW - Dealer Incentives.pdf",
				"GMA - PO.pdf",
				"GMA - SOW.pdf",
				"HMA - SOW - Tier 3 2023.pdf",
				"Hyundai-IWA - CO - Calculator widgets.pdf",
				"Hyundai-IWA - MSA.pdf",
				"Hyundai-IWA - PO.pdf",
				"Hyundai-IWA - SOW - 2023 Extension.pdf",
				"Hyundai-IWA - SOW.docx",
				"Hyundai-IWA - SOW.pdf",
				"IID - SOW - Extension through 2021.pdf",
				"IID - SOW_PO - 2023.pdf",
				"Kia - Change Order - iFrame adjustment.pdf",
				"Kia - MSA - 2021.pdf",
				"KIA - PO - 2021.pdf",
				"KIA - PO - 2022 maintenance.pdf",
				"Kia - PO - Tier 1 2023 extension.pdf",
				"Kia - SOW - 2021.docx",
				"Kia - SOW - 2021.pdf",
				"KIA - SOW_PO - T 1 6-month extension 2023.pdf",
				"KIA-CO-02 Removing Spanish.pdf",
				"Leasly - MSA.pdf",
				"Lithia Motors - MSA.pdf",
				"Lithia Motors - SOW - EV Shopper additions 2021.pdf",
				"Lithia Motors - SOW - EV Shopper.pdf",
				"Lithia Motors - SOW - Written Guides.pdf",
				"Merchants Fleet - MSA.pdf",
				"Merchants_Fleet - SOW - Commercial_Vehicle_Catalog.pdf",
				"NRG - MSA.pdf",
				"NRG - SOW - EV Shopper.pdf",
				"OfferLogix - MSA & SOW.pdf",
				"PG&E -  PO - Used EVs maintenance 2700770811.pdf",
				"PG&E - Change Order - EVSC Phase 3 - Maintenance continuation.pdf",
				"PG&E - Change Order (no cost) - Phase 6a.pdf",
				"PG&E - CWA - EVSC Phase 6a.pdf",
				"PG&E - CWA - Real time charger availability maintenance - C47017.pdf",
				"PG&E - CWA - SMD.pdf",
				"PG&E - CWA - Spanish and Chinese translation maintenance - C47018.pdf",
				"PG&E - CWA - Spanish translation and tool maintenance 2022 - C47042.pdf",
				"PG&E - CWA - Used EV Catalog 2022 - C47016.pdf",
				"PG&E - MSA - Extension to 2024.pdf",
				"PG&E - MSA - Original MSA.pdf",
				"PG&E - PO - 2700369956.pdf",
				"PG&E - PO - 2700504184.pdf",
				"PG&E - PO - EVSC Maintenance continuation through June 30, 2022 .pdf",
				"PG&E - PO - EVSC PSPS scraper and zone display.pdf",
				"PG&E - PO - Fleets Phase 1.pdf",
				"PG&E - PO - O&M Base Legacy, Real Time Charger Improvements.pdf",
				"PG&E - PO - Phase 1 Build.pdf",
				"PG&E - PO - Phase 6a.pdf",
				"PG&E - PO - Phase 6b.pdf",
				"PG&E - PO - PSPS Enhancements Nov 2021.pdf",
				"PG&E - PO - Rate advisor & maintenance.pdf",
				"PG&E - PO - Real time charger maintenance 2700770812.pdf",
				"PG&E - PO - SMD.pdf",
				"PG&E - PO - Spanish translations + other maintenance fees 2700769890.pdf",
				"PG&E - PO - Translations maintenance 2700770814.pdf",
				"PG&E - SOW - Adding EVSP links to charging station maps.pdf",
				"PG&E - SOW - Commercial Rate Calculator.pdf",
				"PG&E - SOW - EVSC - Phase 7.pdf",
				"PG&E - SOW - EVSC - PSPS Enhancements.pdf",
				"PG&E - SOW - EVSC - PSPS.pdf",
				"PG&E - SOW - EVSC - Real time charger availability.pdf",
				"PG&E - SOW - EVSC Phase 1.pdf",
				"PG&E - SOW - EVSC Phase 2.pdf",
				"PG&E - SOW - EVSC Phase 3.pdf",
				"PG&E - SOW - EVSC Phase 6a.pdf",
				"PG&E - SOW - Fleet Phase 2.pdf",
				"PG&E - SOW - Fleets Phase 2.pdf",
				"PG&E - SOW - Fleets.pdf",
				"PG&E - SOW - Marketplace.pdf",
				"PG&E - SOW - Phase 6b.pdf",
				"PG&E - SOW - SMD.pdf",
				"PG&E Fleets - 2022 - Amend & Extend.pdf",
				"PG&E Fleets - PO - 2022 - Amend & Extend.pdf",
				"PGE - PO - Fleets Phase 2.pdf",
				"PGE - PO - Marketplace.pdf",
				"PGE-Marketplace-SOW-02.pdf",
				"Phoenix Energy - SOW.pdf",
				"PIA - MSA - Customer_Engagement_Platform_and_Data_Management_Agreement.pdf",
				"PIA - MSA - DMA_Sept2020.pdf",
				"PIA - SOW - Dealer feed.pdf",
				"PIA - SOW - Local data for Sacramento.pdf",
				"PIA - SOW - Revised Amendment 4.pdf",
				"PIA - SOW - SDGE tracking.pdf",
				"Plug N Drive - MSA.pdf",
				"Plug N Drive - SOW - EV Shopper.pdf",
				"Plug N Drive - SOW - French addition.pdf",
				"Polestar - MSA.pdf",
				"Polestar - SOW - Lead generation.pdf",
				"Proterra - MSA.pdf",
				"Proterra - SOW - EV Fleets.pdf",
				"PRPA - CO - EV Information Page.pdf",
				"PRPA - MSA.pdf",
				"PRPA - SOW - EV Shopper.pdf",
				"PSE - MSA.pdf",
				"PSE - PO.pdf",
				"PSE - SOW - EV Shopper extension through 2024.pdf",
				"PSE - SOW - EV Shopper.pdf",
				"PSE - SOW - Fleets.pdf",
				"Resource Innovation - EV Fleets - Signed.pdf",
				"Rhythm Energy - MSA+SOW - EV Shopper.pdf",
				"SCE - MSA.pdf",
				"SCE - PO - EV Shopper 2023 extension.pdf",
				"SCE - PO - EV Shopper.pdf",
				"SCE - PO - Fleets PO 2022 2023.pdf",
				"SCE - PO - Fleets.pdf",
				"SCE - SOW - EV Shopper.pdf",
				"SCE - SOW - Fleets Change Order 2020 Nov.pdf",
				"SCE Fleets - Email explanation on extension through March 2022.pdf",
				"SCE Fleets - PO - Extension through March 2021.pdf",
				"SCE Fleets - PO.pdf",
				"SCE-FLEETS-SOW-04.pdf",
				"SCL-ICF - MSA_SOW_PO - Commercial EV Catalog.pdf",
				"SCPPA - MSA - Frame Agreement.pdf",
				"SDG&E - MSA & SOW.pdf",
				"Shell - MSA+SOW - Fleet Electrification.pdf",
				"Solectrac EV Fleets - SOW & MSA.pdf",
				"SVCE - MSA+SOW - Phase 1.pdf",
				"SVCE - SOW - 2023 Extension.pdf",
				"SVCE - SOW - Addition of translation.pdf",
				"SVCE - SOW - Extension.pdf",
				"SVCE - SOW - Used EV Catalog.pdf",
				"TID - MSA.pdf",
				"TID - SOW - 2022 Renewal thru 2024.pdf",
				"TID - SOW - EV Shopper.pdf",
				"TID - SOW - Renewal 2022 2024.pdf",
				"TrueCar - MSA+SOW - Vehicle, incentives, home charger data.pdf",
				"TVA-RedPepper - CO - Used EVs.pdf",
				"TVA-RedPepper - MSA.pdf",
				"TVA-RedPepper - SOW - 2023 extension.pdf",
				"TVA-RedPepper - SOW - Addition of upcoming EVs.pdf",
				"TVA-RedPepper - SOW - EV Shopper - APPROVED.pdf",
				"TVA-RedPepper - SOW - Extension 2021.pdf",
				"Uber - MSA & SOW.pdf",
				"Uber PO 2023 - 453658.html",
				"Uber PO 2023 453658.pdf",
				"Uber PO 453658.pdf",
				"Uber PO 454424.pdf",
				"Uber ZappyRide SOW Renewal 2023.pdf",
				"Veloz - MSA - HCA IAA .pdf",
				"Veloz - SOW - API for EFA - 2020.pdf",
				"Veloz - SOW - API for EFA - 2021.pdf",
				"Veloz - SOW - API for EFA - 2022.pdf",
				"Veloz - SOW - API for EFA - 2023.pdf",
				"Veloz - SOW - HCA 1-month extension.pdf",
				"Veloz - SOW - L2 Advisor + Incentive Application.pdf",
				"Veloz - SOW - Term extension through December 2020.pdf",
				"Veloz - SOW - Used Vehicle Incentives Amendment.pdf",
				"Veloz - SOW HCA 6-month extension.pdf",
				"Volvo - MSA.pdf",
				"Volvo - PO - 2023.pdf",
				"Volvo - PO - Data API.PDF",
				"Volvo - SOW - API - Amend & Extend 2023.pdf",
				"Volvo - SOW - Data API.pdf",
				"WEX - MSA.pdf",
				"WEX - SOW - EV Planner.pdf",
				"Xcel - MSA.pdf",
				"Xcel - PO - Colorado 2021 4500918743.pdf",
				"Xcel - PO - DUPLICATE 4500642905.pdf",
				"Xcel - PO - EV Shopper 4500642905.PDF",
				"Xcel - PO - Minnesota 2021 4500918722.pdf",
				"Xcel - PO - New Mexico - 2022",
				"Xcel - SOW - EV Shopper.pdf",
				"Xcel - SOW - EV101, Charging 101 and Pricing Plans.pdf",
				"Xcel - SOW - Inventory Spanish Colorado.pdf",
				"Xcel - SOW - NM Page Additions.pdf",
		};
		List<String> asList = Arrays.asList(arr);
		 return asList;
	}
	
	private static List<String> getSubList() {
		String[] arr = new String[] {
				"SCL-ICF - MSA-SOW-PO - Commercial EV Catalog.pdf",
				"KIA - SOW-PO - T 1 6-month extension 2023.pdf",
				"IID - SOW-PO - 2023.pdf",
				"Veloz - SOW - L2 Advisor - Incentive Application.pdf",
				"ConEd-O-R - PO - Blanket -master) PO.pdf",
				"APS - MSA-SOW - EV Shopper and EV Fleets.pdf",
				"Anaheim - MSA-SOW - EV Shopper.pdf",
				"AE-PO-SOW 8-22 thru 8-23.pdf",
				"SVCE - MSA-SOW - Phase 1.pdf",
				"Shell - MSA-SOW - Fleet Electrification.pdf",
				"TrueCar - MSA-SOW - Vehicle",
				"Rhythm Energy - MSA-SOW - EV Shopper.pdf",
				"PG-E - Change Order -no cost) - Phase 6a.pdf",
				"Hyundai-IWA-SOW-3-Renewal.pdf",
				"KIA - SOW-PO - T 1 6-month extension 2023.pdf",
				"IID - SOW-PO - 2023.pdf",
				"EnergySage - MSA-SOW - EV Shopper.pdf",
				"Ford - MSA-SOW - Consumer incentives API.pdf",
				"SCL-ICF - MSA-SOW-PO - Commercial EV Catalog.pdf",
				"Consumer Reports - MSA-SOW - API.pdf",
				"Chargeway - MSA-SOW.pdf",
				"Consumers Energy - MSA-SOW - EV Shopper and Rate Advisor.pdf",
				"Veloz - MSA - HCA IAA.pdf",
				"CALSTART - SOW - Insite -fleets) initial scope - sole-sourced scope.pdf",
				"CALSTART - SOW - INSITE -fleets) initial scope.pdf",
				"SVCE - MSA-SOW - Phase 1.pdf",
				"TrueCar - MSA-SOW - Vehicle",
				"Rhythm Energy - MSA-SOW - EV Shopper.pdf",
				"SCL-ICF - MSA-SOW-PO - Commercial EV Catalog.pdf",
				"Shell - MSA-SOW - Fleet Electrification.pdf",
				"Ford - MSA-SOW - Consumer incentives API.pdf",
				"EnergySage - MSA-SOW - EV Shopper.pdf",
				"DTE T-Cs - -MSA-.pdf",
				"Consumer Reports - MSA-SOW - API.pdf",
				"Consumers Energy - MSA-SOW - EV Shopper and Rate Advisor.pdf",
				"Chargeway - MSA-SOW.pdf",
				"APS - MSA-SOW - EV Shopper and EV Fleets.pdf",
				"Anaheim - MSA-SOW - EV Shopper.pdf",
				"DLC - PO - EV Shopper build - maintenance 2019-2020.pdf",
				"PG-E - PO - Spanish translations - other maintenance fees 2700769890.pdf",
				"PG-E - PO - O-M Base Legacy",
				"PG-E - PO - EVSC Maintenance continuation through June 30",
		};
		List<String> asList = Arrays.asList(arr);
		 return asList;
	}
}
