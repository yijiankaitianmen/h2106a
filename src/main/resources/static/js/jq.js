function findc(url,pid,domId,selectId){
	//ajax异步请求，根据pid去查询数据
	$.post(url,{pid:pid},function(data){
		//先清空历史数据
		//$("#gid").find("option").remove();
		$("#"+domId).empty();
		//追加一个默认请选择
		$("#"+domId).append("<option value='0'>请选择</option>");
		//渲染数据:向select标签追加option标签
		data.forEach(function(compony){
			//compony = {id: 2, cname: "网易", pid: 1}
			//$("#gid")//获取到select标签的dom对象
			if(compony.id == selectId){
				$("#"+domId).append("<option selected value='"+compony.id+"'>"+compony.cname+"</option>");
			}else{
				$("#"+domId).append("<option value='"+compony.id+"'>"+compony.cname+"</option>");
			}
			
		});
	});
}