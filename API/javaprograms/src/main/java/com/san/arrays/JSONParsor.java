package com.san.arrays;

import org.json.JSONObject;

public class JSONParsor {

	public static void main(String[] args) {
		
		String jsonString = getJsonString2();
		
		JSONObject jsonObj = new JSONObject(jsonString);
		
		for(int i =0;i<=12;i++) {
			JSONObject tmep = new JSONObject();
			tmep =  (JSONObject) jsonObj.get(i+"");
			System.out.println(tmep.get("_id"));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static String getJsonString2() {
		String val = "{\r\n" + 
				"    \"result\" : [ \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"HBO GO slides for SM Group.pptx\",\r\n" + 
				"            \"count\" : 4\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"Market Analysis - MS.xlsx\",\r\n" + 
				"            \"count\" : 8\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"DTC & CS - RACI Matrix (FINAL) 26-Apr.xlsx\",\r\n" + 
				"            \"count\" : 20\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"Perf Marketing Assets Sheet.xlsx\",\r\n" + 
				"            \"count\" : 22\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"Untitled document.docx\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"Untitled spreadsheet.xlsx\",\r\n" + 
				"            \"count\" : 2\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"Master Social Calendar 2023.xlsx\",\r\n" + 
				"            \"count\" : 76\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"Virtual Egg Hunt Winners.xlsx\",\r\n" + 
				"            \"count\" : 19\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"Bi-Weekly Report Raw Data.xlsx\",\r\n" + 
				"            \"count\" : 64\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"Presentation outline - SM Group.pptx\",\r\n" + 
				"            \"count\" : 1\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"MAX Marketing Planning Milestones.xlsx\",\r\n" + 
				"            \"count\" : 44\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"TW Historicals.xlsx\",\r\n" + 
				"            \"count\" : 34\r\n" + 
				"        }, \r\n" + 
				"        {\r\n" + 
				"            \"_id\" : \"Markets Analysis .xlsx\",\r\n" + 
				"            \"count\" : 25\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    \"ok\" : 1\r\n" + 
				"}";
		return val;
	}
	
	
	
	
	
	

	private static String getJsonString() {
		String val = "{\r\n" + 
				"    \"0\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"_id_\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"_id\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"1\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpace_hashed\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpace\" : \"hashed\"\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"2\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"processStatus_1_threadBy_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"processStatus\" : 1,\r\n" + 
				"            \"threadBy\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"3\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"isFileMove_hashed\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"isFileMove\" : \"hashed\"\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"4\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"createdTime_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"createdTime\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"5\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"createdTime_-1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"createdTime\" : -1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"6\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"createdTimeStamp_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"createdTimeStamp\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"7\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpaceId_1_processStatus_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpaceId\" : 1,\r\n" + 
				"            \"processStatus\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"8\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpace.$id_1_processStatus_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpace.$id\" : 1,\r\n" + 
				"            \"processStatus\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"9\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpace_1_fileProcessEndTime_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpace\" : 1,\r\n" + 
				"            \"fileProcessEndTime\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"10\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"objectSize_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"objectSize\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"11\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"processStatus_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"processStatus\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"12\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"processStatus_1_fileProcessStartTime_1_fileProcessEndTime_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"processStatus\" : 1,\r\n" + 
				"            \"fileProcessStartTime\" : 1,\r\n" + 
				"            \"fileProcessEndTime\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"13\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"retry_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"retry\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"14\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"processStatus_1_CONFLICT_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"processStatus\" : 1,\r\n" + 
				"            \"CONFLICT\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"15\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"userId_hashed\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"userId\" : \"hashed\"\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"16\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"processStatus_1_retry_1_createdTime_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"processStatus\" : 1,\r\n" + 
				"            \"retry\" : 1,\r\n" + 
				"            \"createdTime\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"17\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpaceId_1_isFileMove_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpaceId\" : 1,\r\n" + 
				"            \"isFileMove\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"18\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"imageBackUp_hashed\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"imageBackUp\" : \"hashed\"\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"19\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"fileVersion_hashed\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"fileVersion\" : \"hashed\"\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"20\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"migrationFileUUID_hashed\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"migrationFileUUID\" : \"hashed\"\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"21\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpaceId_1_cfFileMini.objectName_1_cfFileMini.fileVersionCount_1_cfFileMini.parent_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpaceId\" : 1,\r\n" + 
				"            \"cfFileMini.objectName\" : 1,\r\n" + 
				"            \"cfFileMini.fileVersionCount\" : 1,\r\n" + 
				"            \"cfFileMini.parent\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"22\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpaceId_1_processStatus_1_isSPOMigrationPick_1_isFolder_-1_threadBy_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpaceId\" : 1,\r\n" + 
				"            \"processStatus\" : 1,\r\n" + 
				"            \"isSPOMigrationPick\" : 1,\r\n" + 
				"            \"isFolder\" : -1,\r\n" + 
				"            \"threadBy\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"23\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"destParent_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"destParent\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"24\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpaceId_1_userId_1_destParent_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpaceId\" : 1,\r\n" + 
				"            \"userId\" : 1,\r\n" + 
				"            \"destParent\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"25\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpaceId_1_migrationJobId_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpaceId\" : 1,\r\n" + 
				"            \"migrationJobId\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"26\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"spocMigrationPick_hashed\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"spocMigrationPick\" : \"hashed\"\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"27\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"migApiParent_hashed\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"migApiParent\" : \"hashed\"\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"28\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpaceId_1_migApiParent_1_manualCommentCsv_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpaceId\" : 1,\r\n" + 
				"            \"migApiParent\" : 1,\r\n" + 
				"            \"manualCommentCsv\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"29\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"isOdfbMigrationPick _1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"isOdfbMigrationPick \" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"30\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"azureMigrationPick_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"azureMigrationPick\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"31\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"processStatus_1_spocMigrationPick_1_threadBy_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"processStatus\" : 1,\r\n" + 
				"            \"spocMigrationPick\" : 1,\r\n" + 
				"            \"threadBy\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"32\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"processStatus_1_isSPOMigrationPick_1_threadBy_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"processStatus\" : 1,\r\n" + 
				"            \"isSPOMigrationPick\" : 1,\r\n" + 
				"            \"threadBy\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"33\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"processStatus_1_isOdfbMigrationPick_1_threadBy_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"processStatus\" : 1,\r\n" + 
				"            \"isOdfbMigrationPick\" : 1,\r\n" + 
				"            \"threadBy\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    },\r\n" + 
				"    \"34\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpaceId_1_processStatus_1_threadBy_1\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpaceId\" : 1,\r\n" + 
				"            \"processStatus\" : 1,\r\n" + 
				"            \"threadBy\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.MoveEachFiles\"\r\n" + 
				"    }\r\n" + 
				"}";
		return val;
	}
}
