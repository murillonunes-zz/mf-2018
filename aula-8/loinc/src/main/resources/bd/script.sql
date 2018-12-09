DROP TABLE IF EXISTS loinc;
CREATE TABLE IF NOT EXISTS loinc(
   LOINC_NUM        VARCHAR(10) NOT NULL PRIMARY KEY
  ,COMPONENT        VARCHAR(246) NOT NULL
  ,SCALE_TYP        VARCHAR(50)
  ,LONG_COMMON_NAME VARCHAR(254) NOT NULL
  ,SHORTNAME        VARCHAR(51)
);
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('10000-8','R wave duration.lead AVR','Qn','R wave duration in lead AVR','R wave dur L-AVR');
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('10001-6','R wave duration.lead I','Qn','R wave duration in lead I','R wave dur L-I');
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('10002-4','R wave duration.lead II','Qn','R wave duration in lead II','R wave dur L-II');
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('10003-2','R wave duration.lead III','Qn','R wave duration in lead III','R wave dur L-III');
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('10004-0','R wave duration.lead V1','Qn','R wave duration in lead V1','R wave dur L-V1');
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('10005-7','R wave duration.lead V2','Qn','R wave duration in lead V2','R wave dur L-V2');
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('10006-5','R wave duration.lead V3','Qn','R wave duration in lead V3','R wave dur L-V3');
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('10007-3','R wave duration.lead V4','Qn','R wave duration in lead V4','R wave dur L-V4');
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('10008-1','R wave duration.lead V5','Qn','R wave duration in lead V5','R wave dur L-V5');
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('1000-9','DBG Ab','Ord','DBG Ab [Presence] in Serum or Plasma from Blood product unit','DBG Ab SerPl BPU Ql');
INSERT INTO loinc(LOINC_NUM,COMPONENT,SCALE_TYP,LONG_COMMON_NAME,SHORTNAME) VALUES ('10009-9','R wave duration.lead V6','Qn','R wave duration in lead V6','R wave dur L-V6');