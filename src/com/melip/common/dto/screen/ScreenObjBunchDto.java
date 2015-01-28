package com.melip.common.dto.screen;

import java.util.List;

import com.melip.common.dto.common.AbstractDto;

/**
 * スクリーンオブジェクトバンチDTO.
 */
public class ScreenObjBunchDto extends AbstractDto {

  /** 地域IDのフィールド名 */
  public static final String FIELD_REGION_ID = "regionId";
  /** 施設グループIDのフィールド名 */
  public static final String FIELD_FACILITY_GRP_ID = "facilityGrpId";
  /** 施設IDのフィールド名 */
  public static final String FIELD_FACILITY_ID = "facilityId";
  /** スクリーンオブジェクトDTOリストのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_DTO_LIST = "screenObjDtoList";

  /** 地域ID */
  private Integer regionId;
  /** 施設グループID */
  private Integer facilityGrpId;
  /** 施設ID */
  private Integer facilityId;
  /** スクリーンオブジェクトDTOリスト */
  private List<ScreenObjDto> screenObjDtoList;

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
   * スクリーンオブジェクトDTOリストを取得します。
   * 
   * @return スクリーンオブジェクトDTOリスト
   */
  public List<ScreenObjDto> getScreenObjDtoList() {
    return screenObjDtoList;
  }

  /**
   * スクリーンオブジェクトDTOリストを設定します。
   * 
   * @param screenObjDtoList スクリーンオブジェクトDTOリスト
   */
  public void setScreenObjDtoList(List<ScreenObjDto> screenObjDtoList) {
    this.screenObjDtoList = screenObjDtoList;
  }

}
