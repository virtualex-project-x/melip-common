package com.melip.common.dto.screen;

import java.util.List;

import com.melip.common.dto.common.AbstractDto;

/**
 * スクリーンDTO
 */
public class ScreenDto extends AbstractDto {

  /** レイアウトIDのフィールド名 */
  public static final String FIELD_LAYOUT_ID = "layoutId";
  /** スクリーンIDのフィールド名 */
  public static final String FIELD_SCREEN_ID = "screenId";
  /** スクリーンオブジェクトグループリストのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_GRP_DTO_LIST = "screenObjGrpDtoList";

  /** レイアウトID */
  private Integer layoutId;
  /** スクリーンID */
  private Integer screenId;
  /** スクリーンオブジェクトグループリスト */
  private List<ScreenObjGrpDto> screenObjGrpDtoList;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

  /**
   * レイアウトIDを取得します。
   * 
   * @return レイアウトID
   */
  public Integer getLayoutId() {
    return layoutId;
  }

  /**
   * レイアウトIDを設定します。
   * 
   * @param layoutId レイアウトID
   */
  public void setLayoutId(Integer layoutId) {
    this.layoutId = layoutId;
  }

  /**
   * スクリーンIDを取得します。
   * 
   * @return スクリーンID
   */
  public Integer getScreenId() {
    return screenId;
  }

  /**
   * スクリーンIDを設定します。
   * 
   * @param screenId スクリーンID
   */
  public void setScreenId(Integer screenId) {
    this.screenId = screenId;
  }

  /**
   * スクリーンオブジェクトグループリストを取得します。
   * 
   * @return スクリーンオブジェクトグループリスト
   */
  public List<ScreenObjGrpDto> getScreenObjGrpDtoList() {
    return screenObjGrpDtoList;
  }

  /**
   * スクリーンオブジェクトグループリストを設定します。
   * 
   * @param screenObjGrpDtoList スクリーンオブジェクトグループリスト
   */
  public void setScreenObjGrpDtoList(List<ScreenObjGrpDto> screenObjGrpDtoList) {
    this.screenObjGrpDtoList = screenObjGrpDtoList;
  }

}
