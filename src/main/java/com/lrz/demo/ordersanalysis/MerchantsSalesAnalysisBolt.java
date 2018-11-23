package com.lrz.demo.ordersanalysis;

import java.util.Map;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Tuple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.lrz.demo.common.LogInfoHandler;
import com.lrz.demo.domain.OrdersBean;

/**
 * 日志实时分析 Bolt
 * 
 * @Description:
 * @author:DARUI LI
 * @version:1.0.0
 * @Data:2018年11月23日 下午3:40:26
 */
public class MerchantsSalesAnalysisBolt extends BaseRichBolt {
	private static final Logger logger = LoggerFactory.getLogger(MerchantsSalesAnalysisBolt.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = -7834718805727344255L;

	private OutputCollector _collector;

	public void prepare(@SuppressWarnings("rawtypes") Map stormConf, TopologyContext context,
			OutputCollector collector) {
		this._collector = collector;
	}

	public void execute(Tuple input) {
		String orderInfo = input.getString(0);
		// System.err.println(orderInfo);
		LogInfoHandler loginfohandler = new LogInfoHandler();
		OrdersBean order = loginfohandler.getOrdersBean(orderInfo);
		System.err.println(JSON.toJSONString(order));
		logger.error(JSON.toJSONString(order));

	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub

	}

}
