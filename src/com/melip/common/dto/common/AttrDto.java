package com.melip.common.dto.common;

/**
 * 属性DTO
 */
public class AttrDto extends AbstractDto {

  /** 地域IDのフィールド名 */
  public static final String FIELD_REGION_ID = "regionId";
  /** 施設グループIDのフィールド名 */
  public static final String FIELD_FACILITY_GRP_ID = "facilityGrpId";
  /** 施設IDのフィールド名 */
  public static final String FIELD_FACILITY_ID = "facilityId";
  /** 属性グループIDのフィールド名 */
  public static final String FIELD_ATTR_GRP_ID = "attrGrpId";
  /** 属性グループ種別のフィールド名 */
  public static final String FIELD_ATTR_GRP_TYPE = "attrGrpType";
  /** 属性グループ名称のフィールド名 */
  public static final String FIELD_ATTR_GRP_NM = "attrGrpNm";
  /** 属性値のフィールド名 */
  public static final String FIELD_ATTR_VAL = "attrVal";
  /** 属性コード値のフィールド名 */
  public static final String FIELD_ATTR_CD_VAL = "attrCdVal";
  /** 遷移先スクリーンIDのフィールド名 */
  public static final String FIELD_TARGET_SCREEN_ID = "targetScreenId";

  /** 地域ID */
  private Integer regionId;
  /** 施設グループID */
  private Integer facilityGrpId;
  /** 施設ID */
  private Integer facilityId;
  /** 属性グループID */
  private Integer attrGrpId;
  /** 属性グループ種別 */
  private String attrGrpType;
  /** 属性グループ名称 */
  private String attrGrpNm;
  /** 属性値 */
  private String attrVal;
  /** 属性コード値 */
  private String attrCdVal;
  /** 遷移先スクリーンID */
  private Integer targetScreenId;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

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
   * 施設グループIDを取得します。
   * 
   * @return 施設グループID
   */
  public Integer getFacilityGrpId() {
    return facilityGrpId;
  }

  /**
   * 施設グループIDを設定します。
   * 
   * @param facilityGrpId 施設グループID
   */
  public void setFacilityGrpId(Integer facilityGrpId) {
    this.facilityGrpId = facilityGrpId;
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
   * 属性グループIDを取得します。
   * 
   * @return 属性グループID
   */
  public Integer getAttrGrpId() {
    return attrGrpId;
  }

  /**
   * 属性グループIDを設定します。
   * 
   * @param attrGrpId 属性グループID
   */
  public void setAttrGrpId(Integer attrGrpId) {
    this.attrGrpId = attrGrpId;
  }

  /**
   * 属性グループ種別を取得します。
   * 
   * @return 属性グループ種別
   */
  public String getAttrGrpType() {
    return attrGrpType;
  }

  /**
   * 属性グループ種別を設定します。
   * 
   * @param attrGrpType 属性グループ種別
   */
  public void setAttrGrpType(String attrGrpType) {
    this.attrGrpType = attrGrpType;
  }

  /**
   * 属性グループ名称を取得します。
   * 
   * @return 属性グループ名称
   */
  public String getAttrGrpNm() {
    return attrGrpNm;
  }

  /**
   * 属性グループ名称を設定します。
   * 
   * @param attrGrpNm 属性グループ名称
   */
  public void setAttrGrpNm(String attrGrpNm) {
    this.attrGrpNm = attrGrpNm;
  }

  /**
   * 属性値を取得します。
   * 
   * @return 属性値
   */
  public String getAttrVal() {
    return attrVal;
  }

  /**
   * 属性値を設定します。
   * 
   * @param attrVal 属性値
   */
  public void setAttrVal(String attrVal) {
    this.attrVal = attrVal;
  }

  /**
   * 属性コード値を取得します。
   * 
   * @return 属性コード値
   */
  public String getAttrCdVal() {
    return attrCdVal;
  }

  /**
   * 属性コード値を設定します。
   * 
   * @param attrCdVal 属性コード値
   */
  public void setAttrCdVal(String attrCdVal) {
    this.attrCdVal = attrCdVal;
  }

  /**
   * 遷移先スクリーンIDを取得します。
   * 
   * @return 遷移先スクリーンID
   */
  public Integer getTargetScreenId() {
    return targetScreenId;
  }

  /**
   * 遷移先スクリーンIDを設定します。
   * 
   * @param targetScreenId 遷移先スクリーンID
   */
  public void setTargetScreenId(Integer targetScreenId) {
    this.targetScreenId = targetScreenId;
  }

}
