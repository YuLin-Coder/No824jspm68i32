//banner大图
var isTouch = Modernizr.touch,
	isMobile = false,//区分移动端与PC端
	mobile = false,//区分手机端与平板
	w_width = 0,
	w_height = 0,
	bannerImgh=638,
	navItem = 0,
	h_height=0,
	roll=0,
	sTop=150,
	produs=0,
	ST = 0;


function pageBox() {
    w_width = jQuery(window).width();
    w_height = jQuery(window).height();
}

function setImgMax(img, imgW, imgH, tW, tH) {
    var tWidth = tW || w_width;
    var tHeight = tH || w_height;
    var coe = imgH / imgW;
    var coe2 = tHeight / tWidth;
    if (coe < coe2) {
        var imgWidth = tHeight / coe;
        img.css({ height: tHeight, width: imgWidth, left: -(imgWidth - tWidth) / 2, top: 0 });
    } else {
        var imgHeight = tWidth * coe;
        img.css({ height: imgHeight, width: tWidth, left: 0, top: -(imgHeight - tHeight) / 2 });
    };
};
