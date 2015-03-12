package com.melip.common.dto.common;

import java.util.List;

/**
 * 施設登録更新DTO
 */
public class FacilityStoreDto extends AbstractDto {

  private static final long serialVersionUID = 1L;

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
  /** 属性登録更新DTOリストのフィールド名 */
  public static final String FIELD_ATTR_STORE_DTO_LIST = "attrStoreDtoList";

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
  /** 属性登録更新DTOリスト */
  private List<AttrStoreDto> attrStoreDtoList;

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
   * 属性登録更新DTOリストを取得します。
   * 
   * @return 属性登録更新DTOリスト
   */
  public List<AttrStoreDto> getAttrStoreDtoList() {
    return attrStoreDtoList;
  }

  /**
   * 属性登録更新DTOリストを設定します。
   * 
   * @param attrStoreDtoList 属性登録更新DTOリスト
   */
  public void setAttrStoreDtoList(List<AttrStoreDto> attrStoreDtoList) {
    this.attrStoreDtoList = attrStoreDtoList;
  }

}
