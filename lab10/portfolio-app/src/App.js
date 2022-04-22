import './App.css';
import Header from './Header.js';
import WorkExperience from './WorkExperience.js';
import TechnologySummary from './TechnologySummary.js';
import Education from './Education.js';

function App() 
{
  return (
    <div className="App">
     <Header />  
    <main className="container">
        <div className="row mt-3">
            <div className="col-md">
              <WorkExperience />  
            </div>
            <div className="col-md">
                <Education />
            </div>
        </div>
        <div className="row mt-3">
            <div className="col-md mb-5">
                <TechnologySummary />
            </div>
        </div>
    </main>
    
    </div>
  );
}

export default App;
