import React from 'react';
import NavBar from '../components/NavBar';
import VideoListItem from '../components/VideoListItem';

function Student(){
    return(
        <div className="student">
            <NavBar/>
        <div className="video-area">
          <div className="video-current">
            <iframe
              width="100%"
              height="480"
              src="https://www.youtube.com/embed/watch?v=Ay8sBTj2dmw&ab_channel=BandTec-FaculdadedeTecnologiaBandeirantes"
            >
            </iframe>
          </div>
          <div className="video-list-item">
          <VideoListItem  titulo="bla"/>
          <VideoListItem  titulo="bla"/>
          <VideoListItem  titulo="bla"/>
          <VideoListItem  titulo="bla"/>
          <VideoListItem  titulo="bla"/>
          <VideoListItem  titulo="bla"/>
          </div>
           
        </div>
      </div>
    );
}

export default Student;