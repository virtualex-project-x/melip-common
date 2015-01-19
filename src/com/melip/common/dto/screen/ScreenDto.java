package com.melip.common.dto.screen;

import java.util.ArrayList;

import com.melip.common.dto.common.AbstractDto;

/**
 * スクリーンDTO
 */
public class ScreenDto extends AbstractDto {

  /** 遷移先レイアウトIDのフィールド名 */
  public static final String FIELD_TARGET_LAYOUT_ID = "targetLayoutId";
  /** 遷移先スクリーンIDのフィールド名 */
  public static final String FIELD_TARGET_SCREEN_ID = "targetScreenId";
  /** スクリーンオブジェクリストのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_DTO_LIST = "screenObjDtoList";
  /** スクリーンオブジェクトグループリストのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_GRP_DTO_LIST = "screenObjGrpDtoList";

  /** 遷移先レイアウトID */
  private Integer targetLayoutId;
  /** 遷移先スクリーンID */
  private Integer targetScreenId;
  /** スクリーンオブジェクリスト */
  private ArrayList<ScreenObjDto> screenObjDtoList;
  /** スクリーンオブジェクトグループリスト */
  private ArrayList<ScreenObjGrpDto> screenObjGrpDtoList;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

  /**
   * 遷移先レイアウトIDを取得します。
   *
   * @return 遷移先レイアウトID
   */
  public Integer getTargetLayoutId() {
    return targetLayoutId;
  }

  /**
   * 遷移先レイアウトIDを設定します。
   *
   * @param targetLayoutId 遷移先レイアウトID
   */
  public void setTargetLayoutId(Integer targetLayoutId) {
    this.targetLayoutId = targetLayoutId;
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

  /**
   * スクリーンオブジェクリストを取得します。
   *
   * @return スクリーンオブジェクリスト
   */
  public ArrayList<ScreenObjDto> getScreenObjDtoList() {
    return screenObjDtoList;
  }

  /**
   * スクリーンオブジェクリストを設定します。
   *
   * @param screenObjDtoList スクリーンオブジェクリスト
   */
  public void setScreenObjDtoList(ArrayList<ScreenObjDto> screenObjDtoList) {
    this.screenObjDtoList = screenObjDtoList;
  }

  /**
   * スクリーンオブジェクトグループリストを取得します。
   *
   * @return スクリーンオブジェクトグループリスト
   */
  public ArrayList<ScreenObjGrpDto> getScreenObjGrpDtoList() {
    return screenObjGrpDtoList;
  }

  /**
   * スクリーンオブジェクトグループリストを設定します。
   *
   * @param screenObjGrpDtoList スクリーンオブジェクトグループリスト
   */
  public void setScreenObjGrpDtoList(ArrayList<ScreenObjGrpDto> screenObjGrpDtoList) {
    this.screenObjGrpDtoList = screenObjGrpDtoList;
  }

}
