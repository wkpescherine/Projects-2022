import './App.css';

export default function CurrentGames() {
  return (
    <div>
      <div style={{
          display: "flex",
          justifyContent: "center"
        }}>
          <div style={{width: 150}}>
            <div style={{display:"inline", color: "white"}}>
              <h5>Game ID</h5>
            </div>
          </div>
          <div style={{width: 150}}>
            <div style={{display:"inline", color: "white"}}>
              <h5>Players</h5>
            </div>
          </div>
          <div style={{width: 150}}>
            <div style={{display:"inline", color: "white"}}>
              <h5>Capped#</h5>
            </div>
          </div>
          <div style={{width: 150}}>
            <div style={{display:"inline", color: "white"}}>
              <h5>League</h5>
            </div>
          </div>
        </div>
    </div>
  );
}