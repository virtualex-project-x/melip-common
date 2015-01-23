package com.melip.common.dto.screen;

import java.util.List;

import com.melip.common.dto.common.AbstractDto;

/**
 * スクリーンオブジェクトDTOリスト（仮）.
 */
public class ScreenObjDtoList extends AbstractDto {

  // TODO:スクリーンオブジェクトDTOリストリスト（仮）の名称

  /** スクリーンオブジェクトDTOリストのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_DTO_LIST = "screenObjDtoList";
  /** 表示順のフィールド名 */
  public static final String FIELD_DISPLAY_NUM = "displayNum";

  /** スクリーンオブジェクトDTOリスト */
  private List<ScreenObjDto> screenObjDtoList;
  /** 表示順 */
  private Integer displayNum;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

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

  /**
   * 表示順を取得します。
   * 
   * @return 表示順
   */
  public Integer getDisplayNum() {
    return displayNum;
  }

  /**
   * 表示順を設定します。
   * 
   * @param displayNum 表示順
   */
  public void setDisplayNum(Integer displayNum) {
    this.displayNum = displayNum;
  }

}
