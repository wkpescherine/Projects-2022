import './App.css';

function NavBar() {
  return (
    <div style={{
        display: "flex",
        justifyContent: "center"
        }}>
            <div style={
                {width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Home</h5>
                    </div>
            </div>
            <div style={
                {width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Leagues</h5>
                    </div>
            </div>
            <div style={
                {width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Current Games</h5>
                    </div>
            </div>
            <div style={
                {width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Profile</h5>
                    </div>
            </div>
    </div>
  );
}

export default NavBar;