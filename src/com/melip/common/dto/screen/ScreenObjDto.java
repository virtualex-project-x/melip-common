package com.melip.common.dto.screen;

import java.util.List;

import com.melip.common.dto.common.AbstractDto;
import com.melip.common.dto.common.AttDto;

/**
 * スクリーンオブジェクトDTO
 */
public class ScreenObjDto extends AbstractDto {

  /** レイアウトオブジェクトIDのフィールド名 */
  public static final String FIELD_LAYOUT_OBJ_ID = "layoutObjId";
  /** スクリーンオブジェクトIDのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_ID = "screenObjId";
  /** 属性DTOリストのフィールド名 */
  public static final String FIELD_ATT_DTO_LIST = "attDtoList";

  /** レイアウトオブジェクトID */
  private Integer layoutObjId;
  /** スクリーンオブジェクトID */
  private Integer screenObjId;
  /** 属性DTOリスト */
  private List<AttDto> attDtoList;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

  /**
   * レイアウトオブジェクトIDを取得します。
   *
   * @return レイアウトオブジェクトID
   */
  public Integer getLayoutObjId() {
    return layoutObjId;
  }

  /**
   * レイアウトオブジェクトIDを設定します。
   *
   * @param layoutObjId レイアウトオブジェクトID
   */
  public void setLayoutObjId(Integer layoutObjId) {
    this.layoutObjId = layoutObjId;
  }

  /**
   * スクリーンオブジェクトIDを取得します。
   *
   * @return スクリーンオブジェクトID
   */
  public Integer getScreenObjId() {
    return screenObjId;
  }

  /**
   * スクリーンオブジェクトIDを設定します。
   *
   * @param screenObjId スクリーンオブジェクトID
   */
  public void setScreenObjId(Integer screenObjId) {
    this.screenObjId = screenObjId;
  }

  /**
   * 属性DTOリストを取得します。
   * 
   * @return 属性DTOリスト
   */
  public List<AttDto> getAttDtoList() {
    return attDtoList;
  }

  /**
   * 属性DTOリストを設定します。
   * 
   * @param attDtoList 属性DTOリスト
   */
  public void setAttDtoList(List<AttDto> attDtoList) {
    this.attDtoList = attDtoList;
  }

}
