package com.melip.common.dto.common;

import java.util.List;

/**
 * 施設DTO
 */
public class FacilityDto extends AbstractDto {

  private static final long serialVersionUID = 1L;

  /** エンティティ */
  public static final String ENTITY = "Facility";

  /** 施設IDのフィールド名 */
  public static final String FIELD_FACILITY_ID = "facilityId";
  /** 地域IDのフィールド名 */
  public static final String FIELD_REGION_ID = "regionId";
  /** 公開ステータスのフィールド名 */
  public static final String FIELD_PUBLISH_STS = "publishSts";
  /** 緯度のフィールド名 */
  public static final String FIELD_LATITUDE = "latitude";
  /** 経度のフィールド名 */
  public static final String FIELD_LONGITUDE = "longitude";
  /** 親施設IDのフィールド名 */
  public static final String FIELD_PARENT_FACILITY_ID = "parentFacilityId";
  /** 距離のフィールド名 */
  public static final String FIELD_DISTANCE = "distance";
  /** 属性DTOリストのフィールド名 */
  public static final String FIELD_ATTR_DTO_LIST = "attrDtoList";

  /** 施設ID */
  private Integer facilityId;
  /** 地域ID */
  private Integer regionId;
  /** 公開ステータス */
  private String publishSts;
  /** 緯度 */
  private Float latitude;
  /** 経度 */
  private Float longitude;
  /** 親施設ID */
  private Integer parentFacilityId;
  /** 距離 */
  private Integer distance;
  /** 属性DTOリスト */
  private List<AttrDto> attrDtoList;

  /**
   * 属性グループエイリアスを元に属性値を取得します。
   * 
   * @param attrGrpAlias 属性グループエイリアス
   * @return 属性値
   */
  public String getAttrVal(String attrGrpAlias) {

    String attrVal = null;

    if (null != getAttrDtoList() && getAttrDtoList().size() > 0) {
      for (AttrDto attrDto : getAttrDtoList()) {
        if (attrGrpAlias.equals(attrDto.getAttrGrpAlias())) {
          attrVal = attrDto.getAttrVal();
        }
      }
    }

    return attrVal;
  }

  /**
   * 施設IDを取得します。
   * 
   * @return 施設ID
   */
  public Integer getFacilityId() {
    return facilityId;
  }

  /**
   * 施設IDを設定します。
   * 
   * @param facilityId 施設ID
   */
  public void setFacilityId(Integer facilityId) {
    this.facilityId = facilityId;
  }

  /**
   * 地域IDを取得します。
   * 
   * @return 地域ID
   */
  public Integer getRegionId() {
    return regionId;
  }

  /**
   * 地域IDを設定します。
   * 
   * @param regionId 地域ID
   */
  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  /**
   * 公開ステータスを取得します。
   * 
   * @return 公開ステータス
   */
  public String getPublishSts() {
    return publishSts;
  }

  /**
   * 公開ステータスを設定します。
   * 
   * @param publishSts 公開ステータス
   */
  public void setPublishSts(String publishSts) {
    this.publishSts = publishSts;
  }

  /**
   * 緯度を取得します。
   * 
   * @return 緯度
   */
  public Float getLatitude() {
    return latitude;
  }

  /**
   * 緯度を設定します。
   * 
   * @param latitude 緯度
   */
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  /**
   * 経度を取得します。
   * 
   * @return 経度
   */
  public Float getLongitude() {
    return longitude;
  }

  /**
   * 経度を設定します。
   * 
   * @param longitude 経度
   */
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  /**
   * 親施設IDを取得します。
   * 
   * @return 親施設ID
   */
  public Integer getParentFacilityId() {
    return parentFacilityId;
  }

  /**
   * 親施設IDを設定します。
   * 
   * @param parentFacilityId 親施設ID
   */
  public void setParentFacilityId(Integer parentFacilityId) {
    this.parentFacilityId = parentFacilityId;
  }

  /**
   * 距離を取得します。
   * 
   * @return 距離
   */
  public Integer getDistance() {
    return distance;
  }

  /**
   * 距離を設定します。
   * 
   * @param distance 距離
   */
  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  /**
   * 属性DTOリストを取得します。
   * 
   * @return 属性DTOリスト
   */
  public List<AttrDto> getAttrDtoList() {
    return attrDtoList;
  }

  /**
   * 属性DTOリストを設定します。
   * 
   * @param attrDtoList 属性DTOリスト
   */
  public void setAttrDtoList(List<AttrDto> attrDtoList) {
    this.attrDtoList = attrDtoList;
  }

}
