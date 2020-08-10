$(document).ready(function($) {
  $('.thumbnail-gallery').magnificPopup({
        delegate: 'a',
        type: 'image',
        closeOnContentClick: true,
        closeBtnInside: true,
        mainClass: 'mfp-with-zoom mfp-img-mobile',
        image: {
            verticalFit: true,
            titleSrc: function(item) {
                return item.el.children("img").attr("alt");
            }
        },
        gallery: {
            enabled: true
        },
        zoom: {
            enabled: true,
            duration: 300,
            opener: function(element) {
                return element.find('img');
            }
        }
    });
});