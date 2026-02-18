(function ($) {
  $(".fota-speaker-parallax .has-parallax").attr("id", "has-parallax");
  if ($(".fota-speaker-parallax .has-parallax").length > 0) {
    function fotaSpeakersParallax() {
      var fsParallax = document.getElementById("has-parallax");
      var scrollPosition = window.scrollY;
      fsParallax.style.transform = `translateY(${scrollPosition * 1.25}px)`; // Adjust the scroll speed here
    }
    window.addEventListener("scroll", fotaSpeakersParallax, false);
  }
})(jQuery);
