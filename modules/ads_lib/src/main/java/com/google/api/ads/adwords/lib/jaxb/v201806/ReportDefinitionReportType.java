// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.google.api.ads.adwords.lib.jaxb.v201806;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportDefinition.ReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportDefinition.ReportType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KEYWORDS_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="AD_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="URL_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="ADGROUP_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="CAMPAIGN_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="ACCOUNT_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="GEO_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="SEARCH_QUERY_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="AUTOMATIC_PLACEMENTS_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_KEYWORDS_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_PLACEMENTS_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="DESTINATION_URL_REPORT"/&gt;
 *     &lt;enumeration value="SHARED_SET_REPORT"/&gt;
 *     &lt;enumeration value="CAMPAIGN_SHARED_SET_REPORT"/&gt;
 *     &lt;enumeration value="SHARED_SET_CRITERIA_REPORT"/&gt;
 *     &lt;enumeration value="CREATIVE_CONVERSION_REPORT"/&gt;
 *     &lt;enumeration value="CALL_METRICS_CALL_DETAILS_REPORT"/&gt;
 *     &lt;enumeration value="KEYWORDLESS_QUERY_REPORT"/&gt;
 *     &lt;enumeration value="KEYWORDLESS_CATEGORY_REPORT"/&gt;
 *     &lt;enumeration value="CRITERIA_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="CLICK_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="BUDGET_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="BID_GOAL_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="DISPLAY_KEYWORD_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="PLACEHOLDER_FEED_ITEM_REPORT"/&gt;
 *     &lt;enumeration value="PLACEMENT_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_LOCATIONS_REPORT"/&gt;
 *     &lt;enumeration value="GENDER_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="AGE_RANGE_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="CAMPAIGN_LOCATION_TARGET_REPORT"/&gt;
 *     &lt;enumeration value="CAMPAIGN_AD_SCHEDULE_TARGET_REPORT"/&gt;
 *     &lt;enumeration value="PAID_ORGANIC_QUERY_REPORT"/&gt;
 *     &lt;enumeration value="AUDIENCE_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="DISPLAY_TOPICS_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="USER_AD_DISTANCE_REPORT"/&gt;
 *     &lt;enumeration value="SHOPPING_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="PRODUCT_PARTITION_REPORT"/&gt;
 *     &lt;enumeration value="PARENTAL_STATUS_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="PLACEHOLDER_REPORT"/&gt;
 *     &lt;enumeration value="AD_CUSTOMIZERS_FEED_ITEM_REPORT"/&gt;
 *     &lt;enumeration value="LABEL_REPORT"/&gt;
 *     &lt;enumeration value="FINAL_URL_REPORT"/&gt;
 *     &lt;enumeration value="VIDEO_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="TOP_CONTENT_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="CAMPAIGN_CRITERIA_REPORT"/&gt;
 *     &lt;enumeration value="CAMPAIGN_GROUP_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="LANDING_PAGE_REPORT"/&gt;
 *     &lt;enumeration value="MARKETPLACE_PERFORMANCE_REPORT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportDefinition.ReportType")
@XmlEnum
public enum ReportDefinitionReportType {

    KEYWORDS_PERFORMANCE_REPORT,
    AD_PERFORMANCE_REPORT,
    URL_PERFORMANCE_REPORT,
    ADGROUP_PERFORMANCE_REPORT,
    CAMPAIGN_PERFORMANCE_REPORT,
    ACCOUNT_PERFORMANCE_REPORT,
    GEO_PERFORMANCE_REPORT,
    SEARCH_QUERY_PERFORMANCE_REPORT,
    AUTOMATIC_PLACEMENTS_PERFORMANCE_REPORT,
    CAMPAIGN_NEGATIVE_KEYWORDS_PERFORMANCE_REPORT,
    CAMPAIGN_NEGATIVE_PLACEMENTS_PERFORMANCE_REPORT,
    DESTINATION_URL_REPORT,
    SHARED_SET_REPORT,
    CAMPAIGN_SHARED_SET_REPORT,
    SHARED_SET_CRITERIA_REPORT,
    CREATIVE_CONVERSION_REPORT,
    CALL_METRICS_CALL_DETAILS_REPORT,
    KEYWORDLESS_QUERY_REPORT,
    KEYWORDLESS_CATEGORY_REPORT,
    CRITERIA_PERFORMANCE_REPORT,
    CLICK_PERFORMANCE_REPORT,
    BUDGET_PERFORMANCE_REPORT,
    BID_GOAL_PERFORMANCE_REPORT,
    DISPLAY_KEYWORD_PERFORMANCE_REPORT,
    PLACEHOLDER_FEED_ITEM_REPORT,
    PLACEMENT_PERFORMANCE_REPORT,
    CAMPAIGN_NEGATIVE_LOCATIONS_REPORT,
    GENDER_PERFORMANCE_REPORT,
    AGE_RANGE_PERFORMANCE_REPORT,
    CAMPAIGN_LOCATION_TARGET_REPORT,
    CAMPAIGN_AD_SCHEDULE_TARGET_REPORT,
    PAID_ORGANIC_QUERY_REPORT,
    AUDIENCE_PERFORMANCE_REPORT,
    DISPLAY_TOPICS_PERFORMANCE_REPORT,
    USER_AD_DISTANCE_REPORT,
    SHOPPING_PERFORMANCE_REPORT,
    PRODUCT_PARTITION_REPORT,
    PARENTAL_STATUS_PERFORMANCE_REPORT,
    PLACEHOLDER_REPORT,
    AD_CUSTOMIZERS_FEED_ITEM_REPORT,
    LABEL_REPORT,
    FINAL_URL_REPORT,
    VIDEO_PERFORMANCE_REPORT,
    TOP_CONTENT_PERFORMANCE_REPORT,
    CAMPAIGN_CRITERIA_REPORT,
    CAMPAIGN_GROUP_PERFORMANCE_REPORT,
    LANDING_PAGE_REPORT,
    MARKETPLACE_PERFORMANCE_REPORT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ReportDefinitionReportType fromValue(String v) {
        return valueOf(v);
    }

}
