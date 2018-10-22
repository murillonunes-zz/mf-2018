import React, { Component } from 'react';
import './App.css';
import {Map, Marker, GoogleApiWrapper} from 'google-maps-react';

const style = {
  width: '50%',
  height: '50%'
}

const LoadingContainer = (props) => (
  <div>Carregando o mapa...</div>
)

class GMap extends Component {
    
      render() {
        return (
            <Map
              google={this.props.google}
              style={style}
              defaultCenter={
                { 
                  lat: this.props.local.lat,
                  lng: this.props.local.lng 
                }
              }
              center={{
                lat: this.props.local.lat,
                lng: this.props.local.lng
              }}
              zoom={20}
            >
              <Marker onClick={this.onMarkerClick}
                name={'Current location'} 
                position={{lat: this.props.local.lat, lng: this.props.local.lng}}/>
            </Map>
        );
      }
}

export default GoogleApiWrapper({
  apiKey: ('AIzaSyBhyBO6k_H1Ry6vEIlADLS3WNGtIsGBIkQ'),
  LoadingContainer: LoadingContainer
})(GMap)