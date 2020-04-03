package com.ucar.datalink.flinker.plugin.writer.eswriter.client.rest.result.parseHandler.impl;

import com.alibaba.fastjson.JSONObject;
import com.ucar.datalink.flinker.plugin.writer.eswriter.client.rest.constant.ESEnum;
import com.ucar.datalink.flinker.plugin.writer.eswriter.client.rest.result.parseHandler.ParseHandler;
import com.ucar.datalink.flinker.plugin.writer.eswriter.client.rest.vo.CRDResultVo;

/**
 * 
 * Description: 删除返回结果解析器
 * All Rights Reserved.
 * Created on 2016-7-22 下午6:18:58
 * @author  孔增（kongzeng@zuche.com）
 */
public class DeleteParseHandler extends ParseHandler {
	
	@Override
	public CRDResultVo parseData(JSONObject json) {
		
		CRDResultVo vo = new CRDResultVo();
		
		vo.setOperateType(ESEnum.OperateTypeEnum.DELETE);
		
		if(json == null) {
			return vo;
		}
		
		vo.setJsonString(json.toJSONString());
		
		//boolean found = json.getBooleanValue(FOUND_NAME);

		JSONObject shard = json.getJSONObject(SHARD_NAME);
		if(shard != null) {

			int failed = shard.getIntValue(FAILED_NAME);
			int success = shard.getIntValue(SUCCESS_NAME);
			
			if(success > 0 && failed == 0) {
				vo.setSuccess(true);
			}
		}
		
		vo.setIndex(json.getString(INDEX_NAME));
		vo.setType(json.getString(TYPE_NAME));
		vo.setId(json.getString(ID_NAME));
		
		return vo;
		
	}

}
