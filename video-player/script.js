// Video Player
var Player = function (target, options) {
  this.player = document.querySelector(target);
  this.options = Object.assign({ seekTime: 10 }, options);
};

// Play
Player.prototype.play = function () {
  if (this.player.paused) {
    this.player.play();
  }
};

// Pause
Player.prototype.pause = function () {
  if (this.player.playing) {
    this.player.pause();
  }
};

// Rewind
Player.prototype.rewind = function (seekTime) {
  this.player.currentTime -= seekTime || this.options.seekTime;
};

// Forward
Player.prototype.forward = function (seekTime) {
  this.player.currentTime += seekTime || this.options.seekTime;
};

// Play/Pause
Player.prototype.playOrPause = function () {
  if (this.player.paused) {
    this.player.play();
  } else {
    this.player.pause();
  }
};

// Event handler
Player.prototype.on = function (event, callback) {
  this.player.addEventListener(event, callback);
};

// Using player functionality from DOM
const player = new Player('.player');
const btnPlay = document.querySelector('.play');
const btnRewind = document.querySelector('.rewind');
const btnForward = document.querySelector('.forward');

// Detect play button click
btnPlay.addEventListener('click', function () {
  player.playOrPause();
});

// Detect rewind button click
btnRewind.addEventListener('click', function () {
  player.rewind();
});

// Detect forward button click
btnForward.addEventListener('click', function () {
  player.forward();
});

// Update play/pause button text accordion to the events
player.on('play', function () {
  btnPlay.textContent = 'Pause';
});

player.on('pause', function () {
  btnPlay.textContent = 'Play';
});
