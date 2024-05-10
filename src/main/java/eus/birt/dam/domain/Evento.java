package eus.birt.dam.domain;





import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"documentName",
"documentDescription",
"eventType",
"eventStartDate",
"eventEndDate",
"eventCountryName",
"eventTerritoryName",
"eventTownName",
"eventLocation",
"eventLocationName",
"eventWhere",
"eventSponsor",
"eventRegistrationStartDate",
"eventRegistrationEndDate",
"eventOnLine",
"eventSearchDate1",
"eventSearchDate2",
"importance",
"profile",
"parentcorec",
"marks",
"templateType",
"productClub",
"visit",
"store",
"eventTimeTable",
"eventPrice",
"eventDuration",
"eventLanguages",
"eventImageUrl",
"eventSourceUrl",
"eventStatus",
"eventtheme",
"eventtargetgroup",
"latitudelongitude",
"latwgs84",
"lonwgs84",
"placename",
"address",
"municipality",
"municipalitycode",
"postalcode",
"territory",
"territorycode",
"country",
"countrycode",
"phone",
"email",
"webpage",
"friendlyUrl",
"physicalUrl",
"dataXML",
"metadataXML",
"zipFile"
})


@Data
@AllArgsConstructor
@Document(collection="agendaCultural")
public class Evento {
	
	// Id de Mongo
	@JsonProperty("_id")
	private String id;
	@JsonProperty("documentName")
	private String documentName;
	@JsonProperty("documentDescription")
	private String documentDescription;
	@JsonProperty("eventType")
	private String eventType;
	@JsonProperty("eventStartDate")
	private String eventStartDate;
	@JsonProperty("eventEndDate")
	private String eventEndDate;
	@JsonProperty("eventCountryName")
	private String eventCountryName;
	@JsonProperty("eventTerritoryName")
	private String eventTerritoryName;
	@JsonProperty("eventTownName")
	private String eventTownName;
	@JsonProperty("eventLocation")
	private String eventLocation;
	@JsonProperty("eventLocationName")
	private String eventLocationName;
	@JsonProperty("eventWhere")
	private String eventWhere;
	@JsonProperty("eventSponsor")
	private String eventSponsor;
	@JsonProperty("eventRegistrationStartDate")
	private String eventRegistrationStartDate;
	@JsonProperty("eventRegistrationEndDate")
	private String eventRegistrationEndDate;
	@JsonProperty("eventOnLine")
	private String eventOnLine;
	@JsonProperty("eventSearchDate1")
	private String eventSearchDate1;
	@JsonProperty("eventSearchDate2")
	private String eventSearchDate2;
	@JsonProperty("importance")
	private String importance;
	@JsonProperty("profile")
	private String profile;
	@JsonProperty("parentcorec")
	private String parentcorec;
	@JsonProperty("marks")
	private String marks;
	@JsonProperty("templateType")
	private String templateType;
	@JsonProperty("productClub")
	private String productClub;
	@JsonProperty("visit")
	private String visit;
	@JsonProperty("store")
	private String store;
	@JsonProperty("eventTimeTable")
	private String eventTimeTable;
	@JsonProperty("eventPrice")
	private String eventPrice;
	@JsonProperty("eventDuration")
	private String eventDuration;
	@JsonProperty("eventLanguages")
	private String eventLanguages;
	@JsonProperty("eventImageUrl")
	private String eventImageUrl;
	@JsonProperty("eventSourceUrl")
	private String eventSourceUrl;
	@JsonProperty("eventStatus")
	private String eventStatus;
	@JsonProperty("eventtheme")
	private String eventtheme;
	@JsonProperty("eventtargetgroup")
	private String eventtargetgroup;
	@JsonProperty("latitudelongitude")
	private String latitudelongitude;
	@JsonProperty("latwgs84")
	private String latwgs84;
	@JsonProperty("lonwgs84")
	private String lonwgs84;
	@JsonProperty("placename")
	private String placename;
	@JsonProperty("address")
	private String address;
	@JsonProperty("municipality")
	private String municipality;
	@JsonProperty("municipalitycode")
	private String municipalitycode;
	@JsonProperty("postalcode")
	private String postalcode;
	@JsonProperty("territory")
	private String territory;
	@JsonProperty("territorycode")
	private String territorycode;
	@JsonProperty("country")
	private String country;
	@JsonProperty("countrycode")
	private String countrycode;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("email")
	private String email;
	@JsonProperty("webpage")
	private String webpage;
	@JsonProperty("friendlyUrl")
	private String friendlyUrl;
	@JsonProperty("physicalUrl")
	private String physicalUrl;
	@JsonProperty("dataXML")
	private String dataXML;
	@JsonProperty("metadataXML")
	private String metadataXML;
	@JsonProperty("zipFile")
	private String zipFile;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}