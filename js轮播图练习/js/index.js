var index = 0,
 	t = document.getElementsByClassName("top"),
 	i = document.getElementsByTagName("img");

autoPlay();

function changeIndex(){
	for(var x = 0; x < 4; x++){
		t[x].classList.remove("act");
		i[x].classList.add("diimg");
	}
	t[index].classList.add("act");
	i[index].classList.remove("diimg");
}

function autoPlay(){
	setInterval(function(){
		index++;
		if(index > 3){
			index = 0;
		}
		changeIndex();
	},1000
		)
}
