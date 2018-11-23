package com.lrz.demo.ordersanalysis;

import java.util.Map;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Tuple;

import com.lrz.demo.common.LogInfoHandler;
import com.lrz.demo.domain.OrdersBean;

public class MerchantsSalesAnalysisBolt extends BaseRichBolt {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7834718805727344255L;

	private OutputCollector _collector;
	private LogInfoHandler loginfohandler;

	public void prepare(@SuppressWarnings("rawtypes") Map stormConf, TopologyContext context,
			OutputCollector collector) {
		// TODO Auto-generated method stub

	}

	public void execute(Tuple input) {
		String orderInfo = input.getString(0);
		OrdersBean order = loginfohandler.getOrdersBean(orderInfo);

	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub

	}

}
