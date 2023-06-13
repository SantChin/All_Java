package com.san.arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONParserFromString {

	
	public static void main(String[] args) {
		
		String jsonString = getJsonString();
		
		JSONObject jsonObj = new JSONObject(jsonString);
		
		JSONArray jsonArry  = (JSONArray) jsonObj.get("result");
		
		for(int i =0;i<=jsonArry.length()-1;i++) {
			System.out.println();
			JSONObject tmep = new JSONObject();
			tmep =  (JSONObject) jsonArry.get(i);
			System.out.print(tmep.get("_id")+","+tmep.get("count"));
			//System.out.println(tmep.get("_id"));
		}
	}
	
	
	
	
	

	private static String getJsonString() {
		// TODO Auto-generated method stub
		return "{\r\n" + 
				"    \"result\" : [ \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"research.jdpoweronline.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"dealerauthority.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"ahm.acura.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"jdpower.com.sg\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"AutodataCorp.org\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"infogain.com\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"oyasolutions.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"ansira.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"jdpower-surveys.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"wgcgllc.com\",\r\n" + 
				"            \"count\" : 5\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"FCAGROUP.COM\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"affinitiv.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"adpearance.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"alg.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"stout.com\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"montgomery-group.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"nabthat.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"DELOITTE.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"hmausa.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"discover.jdpower.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"streamcompanies.com\",\r\n" + 
				"            \"count\" : 5\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"forddss.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"tekion.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"genesis-concierge.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"podium.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"genesiswelcome.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"dealerx.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"ahm.honda.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"JDPower.onmicrosoft.com\",\r\n" + 
				"            \"count\" : 71\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"coxautoinc.com\",\r\n" + 
				"            \"count\" : 43\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"StreamCompanies.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"dealeron.com\",\r\n" + 
				"            \"count\" : 50\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"Solera.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"innoceanusa.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"proserveit.com\",\r\n" + 
				"            \"count\" : 13\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"motormindz.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"external.fcagroup.com\",\r\n" + 
				"            \"count\" : 11\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"amazon.com\",\r\n" + 
				"            \"count\" : 11\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"techcloudpro.com\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"c-4analytics.com\",\r\n" + 
				"            \"count\" : 6\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"autodatasolutions.com\",\r\n" + 
				"            \"count\" : 35\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"digitalairstrike.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"roadster.com\",\r\n" + 
				"            \"count\" : 11\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"callrevu.com\",\r\n" + 
				"            \"count\" : 9\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"autodata.net\",\r\n" + 
				"            \"count\" : 45\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"gmail.com\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"eleadcrm.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"dxc.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"cdk.com\",\r\n" + 
				"            \"count\" : 8\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"friendemic.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"atlassian.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"darwinautomotive.com\",\r\n" + 
				"            \"count\" : 9\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"smartdigital.jdpower.com\",\r\n" + 
				"            \"count\" : 3\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"jdpower.co.jp\",\r\n" + 
				"            \"count\" : 6\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"upstart.com\",\r\n" + 
				"            \"count\" : 9\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"impel.io\",\r\n" + 
				"            \"count\" : 7\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"stellantis.COM\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"mightyhive.com\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"brasil.jdpower.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"lesautomotive.com\",\r\n" + 
				"            \"count\" : 6\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"external.stellantis.com\",\r\n" + 
				"            \"count\" : 12\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"fzautomotive.com\",\r\n" + 
				"            \"count\" : 10\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"pramata.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"fiatusa.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"teamvelocitymarkting.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"gubagoo.com\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"v2soft.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"marchex.com\",\r\n" + 
				"            \"count\" : 5\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"crosscountry-consulting.com\",\r\n" + 
				"            \"count\" : 5\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"deloitte.com\",\r\n" + 
				"            \"count\" : 49\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"wagoneer.tv\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"purecars.com\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"autofi.io\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"eLeadCRM.com\",\r\n" + 
				"            \"count\" : 6\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"jdpoweronline.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"JDPa.com\",\r\n" + 
				"            \"count\" : 5\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"jdpaconsulting.com\",\r\n" + 
				"            \"count\" : 73\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"22insights.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"karmaautomotive.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"hma.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"merkleinc.com\",\r\n" + 
				"            \"count\" : 18\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"harman.com\",\r\n" + 
				"            \"count\" : 5\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"gm.com\",\r\n" + 
				"            \"count\" : 35\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"goallinesolutions.com\",\r\n" + 
				"            \"count\" : 7\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"jvsads.com\",\r\n" + 
				"            \"count\" : 5\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"jdpowersurveys.com\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"pixelmotion.com\",\r\n" + 
				"            \"count\" : 7\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"4-superior.com\",\r\n" + 
				"            \"count\" : 98\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"pohanka.com\",\r\n" + 
				"            \"count\" : 6\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"dealersocket.com\",\r\n" + 
				"            \"count\" : 13\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"stellantis.com\",\r\n" + 
				"            \"count\" : 87\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"carzato.com\",\r\n" + 
				"            \"count\" : 11\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"jdpower.com\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"research.jdpowercx.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"fcagroup.com\",\r\n" + 
				"            \"count\" : 61\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"yahoo.ca\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"carnow.com\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"teamvelocitymarketing.com\",\r\n" + 
				"            \"count\" : 5\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"dealereprocess.com\",\r\n" + 
				"            \"count\" : 24\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"acuradigitaldealer.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"4-Superior.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"gma.com\",\r\n" + 
				"            \"count\" : 13\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"dealerinspire.com\",\r\n" + 
				"            \"count\" : 43\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"axway.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"jdpower.onmicrosoft.com\",\r\n" + 
				"            \"count\" : 133\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"observepoint.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"entergy.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"eisai.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"hearst.com\",\r\n" + 
				"            \"count\" : 5\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"solera.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"sincrodigital.com\",\r\n" + 
				"            \"count\" : 6\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"chrysler.com\",\r\n" + 
				"            \"count\" : 5\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"autodatacorp.org\",\r\n" + 
				"            \"count\" : 21\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"reputation.com\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"unityworksmedia.com\",\r\n" + 
				"            \"count\" : 30\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"jdpa.com\",\r\n" + 
				"            \"count\" : 2882\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"neuraflash.com\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"chromedata.com\",\r\n" + 
				"            \"count\" : 41\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    \"ok\" : 1\r\n" + 
				"}";
	}
	
	
	
}
