import React from 'react';
import './App.css';

function TOURNAMENTS({tourn}) {
    return (
      <div>
        <p>{tourn} Tournaments Here</p>
        <div style={{
          display: "flex",
          justifyContent: "center"
        }}>
          <div style={
            {width: 200}}
          >
            <div style={{display:"inline", color: "white"}}>
              <h5>Game ID</h5>
            </div>
          </div>
          <div style={
            {width: 200}}
          >
            <div style={{display:"inline", color: "white"}}>
              <h5>Players</h5>
            </div>
          </div>
          <div style={
            {width: 200}}
          >
            <div style={{display:"inline", color: "white"}}>
              <h5>Capped#</h5>
            </div>
          </div>
        </div>
      </div>
    );
  }
  
  export default TOURNAMENTS;